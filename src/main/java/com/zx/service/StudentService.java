package com.zx.service;

import com.zx.beans.Resume;
import com.zx.beans.Student;
import org.springframework.stereotype.Service;

import java.util.Date;

public interface StudentService {



    Integer IsSame(String staccount);

    void studentRegister(Student student);

    void updateinfoStudent(Student student, Date date);

    Resume createResume(Resume resume);

    Student getStudentInfoById(int id);

    Resume getStudentResumeById(int id);

}
