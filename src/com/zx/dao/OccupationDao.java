package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;


import com.zx.beans.Occupation;
import com.zx.beans.Page;
import com.zx.beans.Student;

import java.util.ArrayList;
import java.util.List;

public interface OccupationDao {
    Company occupationByCompanyAdmin(int companyid);

    void Jobpublish(String ocname, String workplace, String worktime, String salary, String requirement);


  Company getOccupationsCompany(int companyid);


    Occupation getOccupationById(int ocid);


    int jobIdBy(String ocname, String workplace, String worktime, String salary, String requirement);

    void deleteCpyandocById(int cpyandocid);

    Student occupationByStudentAdmin(int studentid);
    void deleteOccupationById(int ocid);
    void updateOccupationById(Occupation occupation);
    Student getOccupationsStudent(int studentid);

    void deleteOccupationsByIdStudent(int stuandocid);

}
