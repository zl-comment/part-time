package com.zx.dao.impl;

import com.mysql.jdbc.PreparedStatement;
import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Resume;
import com.zx.beans.Student;
import com.zx.dao.ResumeDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ResumeDaoImpl implements ResumeDao {

    @Override
    public Resume getStudentResume(int id) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select * from resume where id = ?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
            String name= resultSet.getString("name");
            String gender = resultSet.getString("gender");
            int age = resultSet.getInt("age");
            String imaurl= resultSet.getString("imaurl");
            String address= resultSet.getString("address");
            String phone= resultSet.getString("phone");
            String email= resultSet.getString("Email");
            String hobby= resultSet.getString("hobby");
            String major= resultSet.getString("major");
            String workExperience= resultSet.getString("workExperience");
            String selfEvaluation= resultSet.getString("selfEvaluation");
            Resume resume = new Resume(name,gender,age,imaurl,address,phone,email,hobby,major,workExperience,selfEvaluation);
            return resume;

            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return  null;
    }

    @Override
    public void createResume(String name, String gender, String age, String imaurl, String address, String phone, String email, String hobby, String major, String workExperience, String selfEvaluation) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "insert into resume values (null,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,gender);
            ps.setString(3,age);
            ps.setString(4,imaurl);
            ps.setString(2,gender);
            ps.setString(2,gender);
            ps.setString(2,gender);
            ps.setString(2,gender);
            ps.setString(2,gender);
            ps.setString(2,gender);
            ps.setString(2,gender);
            ps.setString(2,gender);
            ps.setString(2,gender);
            ps.execute();
           /* ResultSet resultSet = ps.executeQuery();
            resultSet.next();*/
            /*String name= resultSet.getString("name");
            String gender = resultSet.getString("gender");
            int age = resultSet.getInt("age");
            String imaurl= resultSet.getString("imaurl");
            String address= resultSet.getString("address");
            String phone= resultSet.getString("phone");
            String email= resultSet.getString("Email");
            String hobby= resultSet.getString("hobby");
            String major= resultSet.getString("major");
            String workExperience= resultSet.getString("workExperience");
            String selfEvaluation= resultSet.getString("selfEvaluation");
            Resume resume1 = new Resume(name,gender,age,imaurl,address,phone,email,hobby,major,workExperience,selfEvaluation);
*/
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
    }


}
