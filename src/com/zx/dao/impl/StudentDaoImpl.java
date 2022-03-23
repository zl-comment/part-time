package com.zx.dao.impl;

import com.zx.beans.Student;
import com.zx.dao.StudentDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {

    @Override
    public void Register(String staccount, String stpassword, String stphone, String stschool, String stmajor, int stsystem, java.util.Date stdate) {

        //获取连接
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();

            String sql = "insert into student values (null,null,?,?,?,?,?,?,?,null,0,null)";
            //获取数据库操作对象
            PreparedStatement ps = connection.prepareStatement(sql);

            //如果有？ 替换？
            ps.setString(1,staccount);
            ps.setString(2,stpassword);
            ps.setString(3,stphone);
            ps.setString(4,stschool);
            ps.setString(5,stmajor);
            ps.setInt(6,stsystem);
            java.sql.Date date=new java.sql.Date(stdate.getTime());
            ps.setDate(7,date);

            //执行
            ps.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }

    }



    @Override
    public String login(String usercode, String password) {
        Connection connection=null;

        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT  id   from student  where staccount=? and stpassword=?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1,usercode);
            ps.setString(2,password);

            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                return usercode;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return null;
    }


    @Override
    public Student loginHome(String usercode) {
        Connection connection=null;

        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT *from student  where staccount=? ";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1,usercode);


            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String stname=resultSet.getString("stname");
                String password=resultSet.getString("stpassword");
                String stphone=resultSet.getString("stphone");
                String stschool=resultSet.getString("stschool");
                String stmajor=resultSet.getString("stmajor");
                int stsystem=resultSet.getInt("stsystem");
                Date stdate=resultSet.getDate("stdate");
                String stresume=resultSet.getString("stresume");
                int ststate=resultSet.getInt("ststate");
                int stresumeid=resultSet.getInt("stresumeid");
                Student student=new Student(id,stname,usercode,password,stphone,stschool,stmajor,stsystem,stdate,stresume,ststate,stresumeid);

                System.out.println(student);
                return student;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return null;
    }

    @Override
    public List<Student> getStudentsAdmin() {
        Connection connection=null;
        ArrayList<Student> students=new ArrayList<>();
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT *from student  ";
            PreparedStatement ps = connection.prepareStatement(sql);


            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String stname=resultSet.getString("stname");
                String usercode=resultSet.getString("staccount");
             //   String password=resultSet.getString("stpassword");
                String stphone=resultSet.getString("stphone");
                String stschool=resultSet.getString("stschool");
                String stmajor=resultSet.getString("stmajor");
                int stsystem=resultSet.getInt("stsystem");
              //  Date stdate=resultSet.getDate("stdate");
              //  String stresume=resultSet.getString("stresume");
              //  int ststate=resultSet.getInt("ststate");

                Student student=new Student(id,stname,usercode,stphone,stschool,stmajor,stsystem);

                students.add(student);


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

        return students;
    }


    @Override
    public boolean staccountIsSame(String staccount) {
        Connection connection=null;
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT id   from  student  where staccount=?";
            PreparedStatement   ps = connection.prepareStatement(sql);
            ps.setString(1,staccount);
            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                return true;    //存在
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return false;     //不存在
    }

    @Override
    public Student getStudentByIdAdmin(int studentid) {
        Connection connection=null;
        ArrayList<Student> students=new ArrayList<>();
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT *from student  where id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,studentid);

            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String stname=resultSet.getString("stname");
                String usercode=resultSet.getString("staccount");
                String password=resultSet.getString("stpassword");
                String stphone=resultSet.getString("stphone");
                String stschool=resultSet.getString("stschool");
                String stmajor=resultSet.getString("stmajor");
                int stsystem=resultSet.getInt("stsystem");
                Date stdate=resultSet.getDate("stdate");
                String stresume=resultSet.getString("stresume");
                int ststate=resultSet.getInt("ststate");
                int stresumeid=resultSet.getInt("stresumeid");

                Student student=new Student(id,stname,usercode,password,stphone,stschool,stmajor,stsystem,stdate,stresume,ststate,stresumeid);


                return student;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

      return  null;
    }

    @Override
    public Student getStudentInfoById(int id) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select * from student where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                String staccount = resultSet.getString("staccount");
                String stpassword = resultSet.getString("stpassword");
                String stphone = resultSet.getString("stphone");
                String stschool = resultSet.getString("stschool");
                String stmajor = resultSet.getString("stmajor");
                int stsystem = resultSet.getInt("stsystem");
                Date stdate = resultSet.getDate("stdate");
                Student student = new Student(id,staccount,stpassword,stphone,stschool,stmajor,stsystem,stdate);
                return student;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return null;
    }

    @Override
    public void updateinfoStudent(Student student) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update student set staccount = ?,stpassword = ?, stphone = ?,stschool = ?,stmajor = ?,stsystem= ? ,stdate = ? where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,student.getStaccount());
            ps.setString(2,student.getStpassword());
            ps.setString(3,student.getStphone());
            ps.setString(4,student.getStschool());
            ps.setString(5,student.getStmajor());
            ps.setInt(6,student.getStsystem());
            java.sql.Date date1= new java.sql.Date(student.getStdate().getTime());
            ps.setDate(7, date1);
            ps.setInt(8,student.getId());
            //执行
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getStudentCountAdmin() {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT count(id) num from student ";
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
}
