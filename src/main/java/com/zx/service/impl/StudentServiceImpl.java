package com.zx.service.impl;



import com.zx.beans.Resume;
import com.zx.beans.Student;
import com.zx.dao.AdminDao;
import com.zx.dao.ResumeDao;
import com.zx.dao.StudentDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;


@Service
public class StudentServiceImpl implements com.zx.service.StudentService {


    @Resource
    private SqlSessionTemplate sqlSessionTemplate;



    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    @Override
    public Integer IsSame(String staccount) {
     StudentDao  studentDao = sqlSessionTemplate.getMapper(StudentDao.class);
        return studentDao.staccountIsSame(staccount);


    }

    @Override
    public void studentRegister(Student student) {
        StudentDao studentDao = sqlSessionTemplate.getMapper(StudentDao.class);
//        java.sql.Date date=new java.sql.Date(stdate.getTime());
        studentDao.Register(student);
    }

    @Override
    public void updateinfoStudent(Student student, Date date) {
        StudentDao studentDao = sqlSessionTemplate.getMapper(StudentDao.class);
        java.sql.Date date1=new java.sql.Date(date.getTime());
        studentDao.updateinfoStudent(student,date1);
    }

    @Override
    public Resume createResume(Resume resume) {
        ResumeDao resumeDao = sqlSessionTemplate.getMapper(ResumeDao.class);
        resumeDao.createResume(resume.getName(),resume.getGender(),resume.getAge(),resume.getImaurl(),resume.getAddress(),resume.getPhone(),resume.getHobby(),resume.getWorkExperience(),resume.getMajor(),resume.getSelfEvaluation(),resume.getEmail());
        return resume;
    }

    @Override
    public Student getStudentInfoById(int id) {
        StudentDao studentDao = sqlSessionTemplate.getMapper(StudentDao.class);
        Student student = studentDao.getStudentInfoById(id);
        return student;
    }

    @Override
    public Resume getStudentResumeById(int id) {
        ResumeDao resumeDao = sqlSessionTemplate.getMapper(ResumeDao.class);
        Resume resume = resumeDao.getStudentResumeById(id);
        return resume;
    }
}
