package com.zx.dao;


import com.zx.beans.Admin;
import com.zx.beans.Permission;
import com.zx.beans.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AdminDao   {

    Admin login(@Param("usercode") String usercode, @Param("password") String password);
   List<Permission> findPermissionByRoleId(@Param("RoleId") Integer RoleId);






    void out(int q);
    void in(int q);
    int qian1();
    int qian2();

    Student getStudentByIdAdmin(int parseInt);
}
