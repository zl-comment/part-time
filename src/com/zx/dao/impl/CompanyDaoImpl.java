package com.zx.dao.impl;

import com.zx.beans.Admin;
import com.zx.beans.Company;
import com.zx.dao.CompanyDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyDaoImpl   implements CompanyDao {

    @Override
    public Company login(String usercode, String password) {
        Connection connection=null;


        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT *from company  where cpyaccount=? and cpypassword=?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1,usercode);
            ps.setString(2,password);

            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
               String  cpyname=resultSet.getString("cpyname");
               String  cpyphone=resultSet.getString("cpyphone");
               String  cpyaddress=resultSet.getString("cpyaddress");
               String  cpyinfo=resultSet.getString("cpyinfo");

            Company company=new Company(id,cpyname,usercode,password,cpyphone,cpyaddress,cpyinfo);
                System.out.println(company);
            return  company;


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
