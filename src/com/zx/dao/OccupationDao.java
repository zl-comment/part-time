package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Occupation;

import java.util.ArrayList;
import java.util.List;

import com.zx.beans.Company;

public interface OccupationDao {
    Company occupationByCompany(int companyid);

    void Jobpublish(String ocname, String workplace, String worktime, String salary, String requirement);


    /*List<Occupation>*/Company getOccupationsCompany(int companyid);


    Occupation getOccupationById(int ocid);
    void deleteOccupationById(int ocid);

    int jobIdBy(String ocname, String workplace, String worktime, String salary, String requirement);
}
