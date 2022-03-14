package com.zx.dao;

import com.zx.beans.Student;

import java.util.Date;

public interface StudentDao {
    void Register(String staccount, String stpassword, String stphone, String stschool, String stmajor, int stsystem, Date stdate);


}
