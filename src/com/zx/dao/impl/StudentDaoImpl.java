package com.zx.dao.impl;

import com.zx.beans.Admin;
import com.zx.beans.Student;
import com.zx.dao.StudentDao;
import com.zx.util.JDBCUtil;

import java.sql.*;

public class StudentDaoImpl implements StudentDao {

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
}
