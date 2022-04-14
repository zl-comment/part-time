package com.zx.dao;

import com.zx.beans.Resume;

public interface ResumeDao {
    Resume getStudentResume(int id);

    void createResume(String name, String gender, int age, String imaurl, String address, String phone, String hobby, String workExperience, String major, String selfEvaluation, String email);
}

