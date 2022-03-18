package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Occupation;

import java.util.ArrayList;
import java.util.List;

public interface OccupationDao {
    void Jobpublish(String ocname, String workplace, String worktime, String salary, String requirement);


    /*List<Occupation>*/Company getOccupationsCompany(int companyid);


    Occupation getOccupationById(int ocid);
    int jobIdBy(String ocname, String workplace, String worktime, String salary, String requirement);
    void deleteCpyandocById(int cpyandocid);
    void deleteOccupationById(int ocid);
    void updateOccupationById(Occupation occupation);
}
