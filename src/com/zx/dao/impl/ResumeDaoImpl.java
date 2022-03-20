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
            resultSet.next();
            String name= resultSet.getString("name");
            int age = resultSet.getInt("age");
            String imaurl= resultSet.getString("imaurl");
            String address= resultSet.getString("address");
            String phone= resultSet.getString("phone");
            String email= resultSet.getString("Email");
            String hobby= resultSet.getString("hobby");
            String major= resultSet.getString("major");
            String workExperience= resultSet.getString("workExperience");
            String selfEvaluation= resultSet.getString("selfEvaluation");
            Resume resume = new Resume(name,age,imaurl,address,phone,email,hobby,major,workExperience,selfEvaluation);
            return resume;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return  null;
    }
}
