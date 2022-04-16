package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;
import org.apache.ibatis.annotations.Param;


public interface OccupationDao {
    Company occupationByCompanyAdmin(int companyid);

    void Jobpublish(@Param("ocname") String ocname,@Param("workplace") String workplace,@Param("worktime") String worktime,@Param("salary") String salary,@Param("requirement") String requirement);


    Company getOccupationsCompany(int companyid);


    Occupation getOccupationById(int ocid);

    int jobIdBy(@Param("ocname") String ocname,@Param("workplace") String workplace,@Param("worktime") String worktime,@Param("salary") String salary,@Param("requirement") String requirement);


    void deleteCpyandocById(int cpyandocid);

    void deleteOccupationById(int ocid);

    Student occupationByStudentAdmin(int studentid);

    void updateOccupationById(@Param("occupation") Occupation occupation);

    Student getOccupationsStudent(int studentid);


    void deleteOccupationsByIdStudent(int stuandocid);


}
