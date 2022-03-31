package com.zx.dao;

import com.zx.beans.Resume;

public interface ResumeDao {
    Resume getStudentResume(int id);

    void createResume(String name, String gender, String age, String imaurl, String address, String phone, String email, String hobby, String major, String workExperience, String selfEvaluation);

}

