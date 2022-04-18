package com.zx.dao;

import com.zx.beans.Occupation;
import com.zx.beans.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

public interface StudentDao {

    Student login(@Param("usercode") String usercode, @Param("password") String password);

    void Register(@Param("student") Student student);
    
    /*Student loginHome(String usercode);*/

/*    List<Student> getStudentsAdmin();*/

    Integer staccountIsSame(String staccount);

    Student getStudentByIdAdmin(int studentid);

    Student getStudentInfoById(int id);

    void updateinfoStudent(@Param("student") Student student,@Param("date") java.sql.Date date);

    int getStudentCountAdmin();

//    Occupation getOccupationsByOcnameStudent(String ocname);

    void enlists(@Param("studentid") int c,@Param("occupationid") int occupationid,@Param("resumeid") int resumeid);



}
