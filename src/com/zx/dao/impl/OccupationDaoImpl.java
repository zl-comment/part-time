package com.zx.dao.impl;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.dao.OccupationDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OccupationDaoImpl implements OccupationDao {

    @Override
    public Company occupationByCompany(int companyid) {
        Connection connection=null;
        ArrayList<Occupation> occupations=new ArrayList<Occupation>();
        Company company=new Company();
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT  cpy.id cpyid , cpyname,cpyaccount,cpypassword,cpyphone,cpyaddress,cpyinfo ,oc.id ocid ,ocname,salary,requirement,workplace,worktime  from company cpy,occupation oc,cpyandoc cao where cpy.id=cao.companyid and oc.id=cao.occupationid and cpy.id=?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1,companyid);

            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                int cpyid=resultSet.getInt("cpyid");
                company.setId(cpyid);
                String  cpyname=resultSet.getString("cpyname");
                company.setCpyname(cpyname);
                String  cpyaccount=resultSet.getString("cpyaccount");
                company.setCpyaccount(cpyaccount);
                String  cpypassword=resultSet.getString("cpypassword");
                company.setCpypassword(cpypassword);
                String  cpyphone=resultSet.getString("cpyphone");
                company.setCpyphone(cpyphone);
                String  cpyaddress=resultSet.getString("cpyaddress");
                company.setCpyaddress(cpyaddress);
                String  cpyinfo=resultSet.getString("cpyinfo");
                company.setCpyinfo(cpyinfo);

                int ocid=resultSet.getInt("ocid");

                String ocname=resultSet.getString("ocname");
                Double salary=resultSet.getDouble("salary");
                String requirement=resultSet.getString("requirement");
                String workplace=resultSet.getString("workplace");
                String worktime=resultSet.getString("worktime");


                Occupation occupation=new Occupation(ocid,ocname,salary,requirement,workplace,worktime);

                occupations.add(occupation);
            }

            company.setOccupations(occupations);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return company;


    }
}
