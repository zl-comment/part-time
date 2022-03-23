package com.zx.dao;

import com.zx.beans.Student;


import java.util.Date;

import java.util.Date;
import java.util.List;

public interface StudentDao {

    String login(String usercode, String password);
    void Register(String staccount, String stpassword, String stphone, String stschool, String stmajor, int stsystem, Date stdate);
    Student loginHome(String usercode);

    List<Student> getStudentsAdmin();

    boolean staccountIsSame(String staccount);

    Student getStudentByIdAdmin(int studentid);

    Student getStudentInfoById(int id);

    void updateinfoStudent(Student student);

    int getStudentCountAdmin();
}
