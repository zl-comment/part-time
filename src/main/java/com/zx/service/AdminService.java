package com.zx.service;

import com.zx.beans.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface AdminService {
    Admin adminLogin(String usercode, String password);

    Page<Company> getCompanyList( int pagenum,  int pagesize);

    List<Permission> selectPermission(int roleid);

    @Transactional(propagation = Propagation.REQUIRED)
    void updateCompanyState(List<Company> companies1, int state);

    Page<Company> getCompanyByCpyNameAndCpyAddress(String cpyName, String cpyAddress, int currectpage, int limit);

    Page<Temporary> getOccupationByPage(int currectpage, int limit);

    @Transactional(propagation = Propagation.REQUIRED)
    void updateOccupationState(List<Temporary> occupations, int state);


    Page<Temporary> getOccupationByOcName(String ocName, String workPlace, String cpyName,  String requirement, int currectpage, int limit);

    Company getCompanyByIdAndOccupation(int companyId);

    Page<Student> getStudent(int currectpage, int limit);

    List<Occupation> getStudentByIdAndOccupation(int parseInt);

    Student getStudentByIdAdmin(int parseInt);

    Resume getResumeByResumeId(int parseInt);













    /*    //事务管理的注解
    @Transactional(propagation = Propagation.REQUIRED)
    void test(int q,int q2);*/
}
