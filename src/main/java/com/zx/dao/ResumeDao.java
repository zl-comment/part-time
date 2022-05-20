package com.zx.dao;

import com.zx.beans.Resume;
import org.apache.ibatis.annotations.Param;

public interface ResumeDao {
    Resume getStudentResumeById(int id);

    void createResume(@Param("resume") Resume resume);
    void insertResumeIntoStudent(@Param("resumid")int resumid,@Param("studentid")int studentid);
}

