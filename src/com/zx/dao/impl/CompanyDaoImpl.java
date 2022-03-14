package com.zx.dao.impl;


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





    @Override
    public void Register(String cpyaccount, String cpypassword,String cpyname, String cpyphone, String cpyaddress, String cpyinfo) {
        Connection connection=null;



        try {
            connection= JDBCUtil.getConnection();
            String sql="insert into company values (null,?,?,?,?,?,?)";
            PreparedStatement ps= connection.prepareStatement(sql);
            ps.setString(1,cpyname);
            ps.setString(2,cpyaccount);
            ps.setString(3,cpypassword);
            ps.setString(4,cpyphone);
            ps.setString(5,cpyaddress);
            ps.setString(6,cpyinfo);
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }


    }
}
