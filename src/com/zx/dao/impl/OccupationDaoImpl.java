package com.zx.dao.impl;

import com.mysql.jdbc.PreparedStatement;
import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.dao.CompanyDao;
import com.zx.dao.OccupationDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.zip.ZipOutputStream;

public class OccupationDaoImpl implements OccupationDao {

    @Override
    public void Jobpublish(String ocname, String workplace, String worktime, String salary, String requirement) {
        Connection connection=null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "insert into occupation values (null,?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);


            ps.setString(1,ocname);
            ps.setString(2,salary);
            ps.setString(3,requirement);
            ps.setString(4,workplace);
            ps.setString(5,worktime);
            ps.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }



    }

    @Override
    public Company getOccupationsCompany(int companyid) {
        Connection connection = null;
        ArrayList<Occupation> occupations = new ArrayList<>();
        Company company=new Company();
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT ocname,salary,workplace,requirement , co.id cpyandocid ,oc.id occupationid from occupation oc,cpyandoc co ,company  cpy where oc.id=co.occupationid and cpy.id=co.companyid and cpy.id=? ";
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.setInt(1,companyid);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
            String ocname= resultSet.getString("ocname");
            String salary= resultSet.getString("salary");
            String workplace= resultSet.getString("workplace");
            String requirement= resultSet.getString("requirement");
            int cpyandocid=resultSet.getInt("cpyandocid");  //#
            int occupationid=resultSet.getInt("occupationid");


            Occupation occupation=new Occupation(occupationid,ocname,salary,workplace,requirement);
            occupation.setCpyandocid(cpyandocid);
            occupations.add(occupation);

            }
            company.setOccupations(occupations);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }

        return company;
    }
    @Override
    public Occupation getOccupationById(int ocid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select * from occupation where id = ?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            ps.setInt(1,ocid);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            String ocname= resultSet.getString("ocname");
            String salary= resultSet.getString("salary");
            String requirement = resultSet.getString("requirement");
            String workplace= resultSet.getString("workplace");
            String worktime= resultSet.getString("worktime");
            Occupation occupation = new Occupation(ocid,ocname,salary,requirement,workplace,worktime);
            return occupation;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return  null;
    }

    @Override
    public void deleteOccupationById(int ocid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "delete from occupation where id=?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            System.out.println(ocid);
            ps.setInt(1,ocid);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

    }

    @Override
    public void updateOccupationById(Occupation occupation) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update occupation set ocname = ?,salary = ?,requirement = ?,workplace = ?,worktime = ?where id=?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            ps.setString(1,occupation.getOcname());
            ps.setString(2,occupation.getSalary());
            ps.setString(3,occupation.getRequirement());
            ps.setString(4,occupation.getWorkplace());
            ps.setString(5,occupation.getWorktime());
            ps.setInt(6,occupation.getId());


            ps.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
    }

    @Override
    public void deleteCpyandocById(int cpyandocid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "delete from cpyandoc where id=?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            System.out.println(cpyandocid);
            ps.setInt(1,cpyandocid);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

    }

    @Override
    public int jobIdBy(String ocname, String workplace, String worktime, String salary, String requirement) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT id from occupation  where ocname=? and workplace=? and worktime=? and salary=? and requirement=?";
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.setString(1,ocname);
            ps.setString(2,workplace);
            ps.setString(3,worktime);
            ps.setString(4,salary);
            ps.setString(5,requirement);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            int id = resultSet.getInt("id");
            return id;





        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return 0;
    }




}
