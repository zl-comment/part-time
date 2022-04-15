package com.zx.service;

import com.zx.beans.Resume;
import com.zx.beans.Student;
import org.springframework.stereotype.Service;

import java.util.Date;

public interface StudentService {



    Integer IsSame(String staccount);

    void studentRegister(String staccount, String stpassword, String stphone, String stschool, String stmajor, int stsystem, Date stdate);

    void updateinfoStudent(Student student, Date date);

    Resume createResume(Resume resume);
}
