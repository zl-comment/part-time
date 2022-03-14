package com.zx.dao;

import com.zx.beans.Admin;
import com.zx.beans.Student;

public interface StudentDao {

    Student login(String usercode, String password);
}
