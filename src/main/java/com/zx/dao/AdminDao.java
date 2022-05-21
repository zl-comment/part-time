package com.zx.dao;


import com.zx.beans.Admin;
import com.zx.beans.Permission;
import com.zx.beans.Resume;
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

    Resume getResumeByResumeId(int parseInt);

    List<Admin> getAdminList();

    void updateAdminInfo(@Param("id") int id,@Param("adminname") String adminname,@Param("adminpassword") String adminpassword,@Param("adminphone") String adminphone);

    void updateAdminState(@Param("id") int id,@Param("parseInt") int parseInt);

 void addAdmin(@Param("admin") Admin admin);

 void updateAdandro(@Param("id") int id,@Param("i") int i);

 void insertAdandro(int id);
}
