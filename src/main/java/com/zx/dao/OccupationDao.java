package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface OccupationDao {
    Company occupationByCompanyAdmin(int companyid);

    void Jobpublish(@Param("occupation") Occupation occupation);
    void Jobpublish2(@Param("companyid") int companyid,@Param("occupationid") int occupationid);


    Company getOccupationsCompany(int companyid);


    Occupation getOccupationById(int ocid);

    int jobIdBy(@Param("ocname") String ocname,@Param("workplace") String workplace,@Param("worktime") String worktime,@Param("salary") String salary,@Param("requirement") String requirement);


    void deleteCpyandocById(int cpyandocid);

    void deleteOccupationById(int ocid);

    List<Occupation> occupationByStudentAdmin(int studentid);

    void updateOccupationById(@Param("occupation") Occupation occupation);

    Student getOccupationsStudent(int studentid);


    void deleteOccupationsByIdStudent(int stuandocid);


    void updateOccupationStateAdmin(@Param("id") int id,@Param("state") int state);
}
