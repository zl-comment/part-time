package com.zx.dao;


import com.zx.beans.Student;


import java.util.Date;

import java.util.Date;
import java.util.List;

public interface StudentDao {

    String login(String usercode, String password);
    Student loginHome(String usercode);
    void Register(String staccount, String stpassword, String stphone, String stschool, String stmajor, int stsystem, Date stdate);


    List<Student> getStudentsAdmin();

    boolean staccountIsSame(String staccount);

    Student getStudentByIdAdmin(int studentid);
    void updateinfoStudent(Student student);

    Student getStudentInfoById(int id);
}
