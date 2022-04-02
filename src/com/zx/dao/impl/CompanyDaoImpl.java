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
                int state=resultSet.getInt("state");
                Company company = new Company(id, cpyname, usercode, password, cpyphone, cpyaddress, cpyinfo);
                    company.setState(state);
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
            String sql = "insert into cpyandoc values(null,?,?,null)";
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

/*
    @Override
    public ArrayList<Company> getCompanysAdmin() {   //管理员查找数据库中的公司数据
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
    }*/


    @Override
    public boolean cpyaccountIsSame(String cpyaccount) {      //注册的时候看是否与公司数据库内账号相同
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

    public ArrayList<Occupation> getAdmissionById(int companyid) {
        Connection connection = null;

        ArrayList<Occupation> occupations=new ArrayList<>();
        try {
            connection = JDBCUtil.getConnection();
            String sql = "    SELECT  b.id cpyandocid,b.occupationid ,c.ocname,c.salary,c.requirement,c.workplace,c.worktime, d.id stuandocid,d.studentid,e.stname,e.staccount,e.stpassword,e.stphone,e.stschool,e.stmajor,e.stsystem,e.stdate,e.stresume,e.ststate,e.stresumeid  FROM company a LEFT JOIN cpyandoc b on a.id=b.companyid LEFT JOIN occupation c on c.id=b.occupationid LEFT JOIN stuandoc d ON d.occupationid=c.id LEFT JOIN student e on e.id=d.studentid WHERE a.id=? and d.id!=0";
            PreparedStatement ps =  connection.prepareStatement(sql);
            ps.setInt(1,companyid);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String ocname = resultSet.getString("ocname");
                String stname = resultSet.getString("stname");
                String stschool = resultSet.getString("stschool");
                String salary = resultSet.getString("salary");
                String workplace = resultSet.getString("workplace");
                String requirement = resultSet.getString("requirement");
                int stresumeid = resultSet.getInt("stresumeid");
                int studentid = resultSet.getInt("studentid");
                int cpyandocid = resultSet.getInt("cpyandocid");
                int occupationid = resultSet.getInt("occupationid");
                ArrayList<Student>    students = new ArrayList<>();
                Occupation occupation=new Occupation(occupationid,ocname,salary,workplace,requirement);
                occupation.setCpyandocid(cpyandocid);

                Student student=new Student();
                student.setStresumeid(stresumeid);
                student.setId(studentid);
                student.setStname(stname);
                student.setStschool(stschool);
                students.add(student);
                occupation.setStudents(students);
                occupations.add(occupation);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }

        return occupations;
    }



    @Override
    public int getCompanyCountAdmin() {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT count(id) num from company ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return resultSet.getInt("num");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return 0;
    }

    @Override
    public void updateCompanyPass(int id, int state) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update  company  set state=? where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,state);
            ps.setInt(2,id);

        ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }

    }

    @Override
    public void updateCompanyReject(int id, int state) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update  company  set state=? where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,state);
            ps.setInt(2,id);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
    }

    @Override
    public int selectCompanyCountAdmin(String cpyname,String cpyaddress) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            StringBuffer sql = new StringBuffer("SELECT count(id) num from company where 1=1");
            if (!"".equals(cpyname)) {
                sql.append(" and cpyname like '%" + cpyname + "%' ");
            }
            if (!"".equals(cpyaddress)) {
                sql.append(" and cpyaddress like '%" + cpyaddress + "%' ");
            }


            PreparedStatement ps = connection.prepareStatement(sql.toString());
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return resultSet.getInt("num");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return 0;
    }
}

