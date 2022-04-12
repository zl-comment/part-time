package com.zx.service.impl;


import com.zx.beans.Resume;
import com.zx.beans.Student;
import com.zx.dao.ResumeDao;
import com.zx.dao.StudentDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class StudentServiceImpl {


    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    private StudentDao studentDao;
    private ResumeDao resumeDao;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }


    public  void test() throws ParseException {
        studentDao =sqlSessionTemplate.getMapper(StudentDao.class);

        /*String date2 = "2022-05-15";
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date=sf.parse(date2);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Student student = new Student(1,"aa","123","13333335555","aa","aa",4,date);
        System.out.println(student.getStdate());
        studentDao.updateinfoStudent(student,new java.sql.Date(student.getStdate().getTime()));*/


        resumeDao = sqlSessionTemplate.getMapper(ResumeDao.class);
        Resume resume = resumeDao.getStudentResume(1);
        System.out.println(resume);
    }


}
