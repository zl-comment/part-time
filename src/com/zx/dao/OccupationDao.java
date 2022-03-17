package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Occupation;


public interface OccupationDao {
    Company occupationByCompany(int companyid);

    void Jobpublish(String ocname, String workplace, String worktime, String salary, String requirement);


  Company getOccupationsCompany(int companyid);


    Occupation getOccupationById(int ocid);


    int jobIdBy(String ocname, String workplace, String worktime, String salary, String requirement);

    void deleteCpyandocById(int cpyandocid);
}
