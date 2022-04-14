package com.zx.service;


import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {



    void companyRegister( String cpyaccount,  String cpypassword,  String cpyname, String cpyphone, String cpyaddress,  String cpyinfo);

    void companyUpdate(Company company);

    List<Student>  companyGetAdmissionById(int  companyid);

    void login();

    void test();

}
