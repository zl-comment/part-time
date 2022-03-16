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

            String sql = "insert into student values (null,null,?,?,?,?,?,?,?,null,0)";
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
    public Student login(String usercode, String password) {
        Connection connection=null;

        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT *from student  where staccount=? and stpassword=?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1,usercode);
            ps.setString(2,password);

            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String stname=resultSet.getString("stname");
                String stphone=resultSet.getString("stphone");
                String stschool=resultSet.getString("stschool");
                String stmajor=resultSet.getString("stmajor");
                int stsystem=resultSet.getInt("stsystem");
                Date stdate=resultSet.getDate("stdate");
                String stresume=resultSet.getString("stresume");
                int ststate=resultSet.getInt("ststate");

                Student student=new Student(id,stname,usercode,password,stphone,stschool,stmajor,stsystem,stdate,stresume,ststate);

                System.out.println(student);
            return student;

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Student> getStudents() {
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
                String password=resultSet.getString("stpassword");
                String stphone=resultSet.getString("stphone");
                String stschool=resultSet.getString("stschool");
                String stmajor=resultSet.getString("stmajor");
                int stsystem=resultSet.getInt("stsystem");
                Date stdate=resultSet.getDate("stdate");
                String stresume=resultSet.getString("stresume");
                int ststate=resultSet.getInt("ststate");

                Student student=new Student(id,stname,usercode,password,stphone,stschool,stmajor,stsystem,stdate,stresume,ststate);

                students.add(student);


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}
