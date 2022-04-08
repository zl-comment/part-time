package com.zx.dao;

import com.zx.beans.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface StudentDao {

    String login(@Param("usercode") String usercode, @Param("password") String password);

    void Register(@Param("staccount")  String staccount,@Param("stpassword") String stpassword,@Param("stphone") String stphone,@Param("stschool") String stschool,@Param("stmajor") String stmajor,@Param("stsystem") int stsystem,@Param("stdate") Date stdate);
    
    Student loginHome(String usercode);

/*    List<Student> getStudentsAdmin();*/

    boolean staccountIsSame(String staccount);

    Student getStudentByIdAdmin(int studentid);

    Student getStudentInfoById(int id);

    void updateinfoStudent(Student student);

    int getStudentCountAdmin();
}
