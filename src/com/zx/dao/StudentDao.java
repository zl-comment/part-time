package com.zx.dao;

import com.zx.beans.Student;


import java.util.Date;

import java.util.Date;

public interface StudentDao {

    Student login(String usercode, String password);
    void Register(String staccount, String stpassword, String stphone, String stschool, String stmajor, int stsystem, Date stdate);


    void updateinfo(Student student);
}
