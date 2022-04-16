package com.zx.service;


import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Resume;
import com.zx.beans.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface CompanyService {



    void companyRegister( String cpyaccount,  String cpypassword,  String cpyname, String cpyphone, String cpyaddress,  String cpyinfo);

    void jobPublish(String ocname,String workplace,String worktime,String salary,String requirement);

    Company getOccupationsCompany(int companyid);

    Occupation jobQuery(int ocid);

    void updateOccupationById(Occupation occupation);

    void deleteOccupationById(int ocid,int cpyandocid);

    ArrayList<Student> getAdmissionById(int companyid);

    Resume getStudentResume(int resumeid);

    Company getCompanyById(int companyid);

    void updateCompanyById(Company company);

    void companyUpdate(Company company);

    List<Student>  companyGetAdmissionById(int  companyid);

    void login();

    void test();


}
