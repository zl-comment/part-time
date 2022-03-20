package com.zx.dao.impl;


import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;
import com.zx.dao.CompanyDao;
import com.zx.util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;


public class CompanyDaoImpl   implements CompanyDao {
    @Override
    public String login(String usercode, String password) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT  id  from company  where cpyaccount=? and cpypassword=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usercode);
            ps.setString(2, password);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return usercode;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return null;
    }


    @Override
    public Company loginHome(String usercode) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT *from company  where cpyaccount=? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usercode);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String cpyname = resultSet.getString("cpyname");
                String password=resultSet.getString("cpypassword");
                String cpyphone = resultSet.getString("cpyphone");
                String cpyaddress = resultSet.getString("cpyaddress");
                String cpyinfo = resultSet.getString("cpyinfo");
                Company company = new Company(id, cpyname, usercode, password, cpyphone, cpyaddress, cpyinfo);

                return company;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return null;
    }

    @Override
    public void Register(String cpyaccount, String cpypassword, String cpyname, String cpyphone, String cpyaddress, String cpyinfo) {
        Connection connection = null;


        try {
            connection = JDBCUtil.getConnection();
            String sql = "insert into company values (null,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cpyname);
            ps.setString(2, cpyaccount);
            ps.setString(3, cpypassword);
            ps.setString(4, cpyphone);
            ps.setString(5, cpyaddress);
            ps.setString(6, cpyinfo);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }

    }

    @Override
    public void addOccupation(int companyid, int occupationid) {
        System.out.println(companyid);
        System.out.println(occupationid);
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "insert into cpyandoc values(null,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, companyid);
            ps.setInt(2, occupationid);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
    }


    @Override
    public ArrayList<Company> getCompanysAdmin() {
        Connection connection = null;
        ArrayList<Company> companies = new ArrayList<>();
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT *from company  ";
            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String cpyname = resultSet.getString("cpyname");
                String cpyaccount = resultSet.getString("cpyaccount");
                String cpypassword = resultSet.getString("cpypassword");

                String cpyphone = resultSet.getString("cpyphone");
                String cpyaddress = resultSet.getString("cpyaddress");
                String cpyinfo = resultSet.getString("cpyinfo");

                Company company = new Company(id, cpyname, cpyaccount, cpypassword, cpyphone, cpyaddress, cpyinfo);

                companies.add(company);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }

        return companies;
    }


    @Override
    public boolean cpyaccountIsSame(String cpyaccount) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT id   from  company  where cpyaccount=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cpyaccount);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return true;    //存在
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return false;     //不存在
    }


    @Override
    public Company getCompanyById(int companyid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select * from company where id = ?";
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement(sql);
            ps.setInt(1, companyid);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            String cpyname = resultSet.getString("cpyname");
            String cpyaccount = resultSet.getString("cpyaccount");
            String cpypassword = resultSet.getString("cpypassword");
            String cpyphone = resultSet.getString("cpyphone");
            String cpyaddress = resultSet.getString("cpyaddress");
            String cpyinfo = resultSet.getString("cpyinfo");
            Company company = new Company(companyid, cpyname, cpyaccount, cpypassword, cpyphone, cpyaddress, cpyinfo);
            return company;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return null;
    }

    public void updateCompanyById(Company company) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update company set cpyname = ?,cpyaccount = ?,cpypassword = ?,cpyphone = ?,cpyaddress = ?,cpyinfo = ?where id=?";
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement(sql);
            ps.setString(1, company.getCpyname());
            ps.setString(2, company.getCpyaccount());
            ps.setString(3, company.getCpypassword());
            ps.setString(4, company.getCpyphone());
            ps.setString(5, company.getCpyaddress());
            ps.setString(6, company.getCpyinfo());
            ps.setInt(7, company.getId());

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
    }

    public ArrayList<Student> getAdmissionById(int companyid) {
        Connection connection = null;

        ArrayList<Student>    students = new ArrayList<>();
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT ocname,stname,stschool,stresumeid,salary,workplace,requirement,st.id studentid, co.id cpyandocid,oc.id occupationid from student st,stuandoc sd,occupation oc,cpyandoc co ,company cpy where st.id=sd.studentid and oc.id=sd.occupationid and oc.id=co.occupationid and cpy.id=co.companyid and cpy.id=?";
            PreparedStatement ps =  connection.prepareStatement(sql);
            ps.setInt(1,companyid);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String ocname = resultSet.getString("ocname");
                String stname = resultSet.getString("stname");
                System.out.println(stname);
                String stschool = resultSet.getString("stschool");
                String salary = resultSet.getString("salary");
                String workplace = resultSet.getString("workplace");
                String requirement = resultSet.getString("requirement");
                int stresumeid = resultSet.getInt("stresumeid");
                int studentid = resultSet.getInt("studentid");
                int cpyandocid = resultSet.getInt("cpyandocid");
                int occupationid = resultSet.getInt("occupationid");

                ArrayList<Occupation> occupations = new ArrayList<>();
                Occupation occupation=new Occupation(occupationid,ocname,salary,workplace,requirement);
                occupation.setCpyandocid(cpyandocid);
                occupations.add(occupation);
                Student student=new Student();

                student.setStresumeid(stresumeid);
                student.setId(studentid);
                student.setStname(stname);
                student.setStschool(stschool);
                student.setOccupations(occupations);
                students.add(student);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }

        return students;
    }

}

