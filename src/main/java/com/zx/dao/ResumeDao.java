package com.zx.dao;

import com.zx.beans.Resume;
import org.apache.ibatis.annotations.Param;

public interface ResumeDao {
    Resume getStudentResumeById(int id);

    void createResume(@Param("name") String name, @Param("age")int age, @Param("imaurl")String imaurl, @Param("address")String address, @Param("phone")String phone, @Param("hobby")String hobby, @Param("workExperience")String workExperience, @Param("major")String major, @Param("selfEvaluation")String selfEvaluation, @Param("email")String email);
}

