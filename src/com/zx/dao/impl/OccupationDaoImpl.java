package com.zx.dao.impl;

import com.mysql.jdbc.PreparedStatement;
import com.zx.beans.Company;
import com.zx.beans.Occupation;

import com.zx.beans.Student;
import com.zx.dao.OccupationDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class OccupationDaoImpl implements OccupationDao {

    @Override //company
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

    @Override //company
    public Company      getOccupationsCompany(int companyid) {
        Connection connection = null;
        ArrayList<Occupation> occupations = new ArrayList<>();
        Company company=new Company();
        try {
            connection = JDBCUtil.getConnection();
           // System.out.println(connection);
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

        System.out.println(occupations);
        return company;
    }
    @Override //company
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
            Occupation occupation = new Occupation(ocname,salary,requirement,workplace,worktime);
            return occupation;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return  null;
    }



    @Override     //company
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


    @Override
    public void deleteCpyandocById(int cpyandocid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "delete from cpyandoc where id=?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            ps.setInt(1,cpyandocid);
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
    }

    @Override
    public Company occupationByCompanyAdmin(int companyid) {         //admin
        Connection connection=null;
        ArrayList<Occupation> occupations=new ArrayList<Occupation>();
        Company company=new Company();
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT  cpy.id cpyid , cpyname,cpyaccount,cpypassword,cpyphone,cpyaddress,cpyinfo ,oc.id ocid ,ocname,salary,requirement,workplace,worktime  from company cpy,occupation oc,cpyandoc cao where cpy.id=cao.companyid and oc.id=cao.occupationid and cpy.id=?";
            java.sql.PreparedStatement ps = connection.prepareStatement(sql);

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
                String salary=resultSet.getString("salary");
                String requirement=resultSet.getString("requirement");
                String workplace=resultSet.getString("workplace");
                String worktime=resultSet.getString("worktime");


                Occupation occupation=new Occupation(ocid,ocname,salary,requirement,workplace,worktime);

                occupations.add(occupation);
            }

            company.setOccupations(occupations);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

        return company;
    }


    @Override
    public Student occupationByStudentAdmin(int studentid) {
        Connection connection=null;
        ArrayList<Occupation> occupations=new ArrayList<Occupation>();
        Student student=new Student();
        System.out.println(studentid);
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT  stu.id stid,stname,staccount,stpassword,stphone,stschool,stmajor ,stsystem,stdate,stresume,ststate,oc.id ocid ,ocname,salary,requirement,workplace,worktime  from student stu,occupation oc,stuandoc sta where stu.id=sta.studentid and oc.id=sta.occupationid and stu.id=?";
            java.sql.PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1,studentid);
            ResultSet resultSet= ps.executeQuery();

            while (resultSet.next()){
                int stid=resultSet.getInt("stid");
                student.setId(stid);
                String stname = resultSet.getString("stname");
                student.setStname(stname);
                String staccount = resultSet.getString("staccount");
                student.setStaccount(staccount);
                String stpassword = resultSet.getString("stpassword");
                student.setStpassword(stpassword);
                String stphone = resultSet.getString("stphone");
                student.setStphone(stphone);
                String stschool = resultSet.getString("stschool");
                student.setStschool(stschool);
                String stmajor = resultSet.getString("stmajor");
                student.setStmajor(stmajor);
                int stsystem = resultSet.getInt("stsystem");
                student.setStsystem(stsystem);
                java.sql.Date stdate = resultSet.getDate("stdate");
                java.util.Date date=new java.util.Date(stdate.getTime());
                student.setStdate(date);
                String stresume = resultSet.getString("stresume");
                student.setStresume(stresume);
                int ststate=resultSet.getInt("ststate");
                student.setStstate(ststate);










                int ocid=resultSet.getInt("ocid");

                String ocname=resultSet.getString("ocname");
                String salary=resultSet.getString("salary");
                String requirement=resultSet.getString("requirement");
                String workplace=resultSet.getString("workplace");
                String worktime=resultSet.getString("worktime");


                Occupation occupation=new Occupation(ocid,ocname,salary,requirement,workplace,worktime);

                occupations.add(occupation);
            }

            student.setOccupations(occupations);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

        return student;
    }
}
