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

    void updateCompanyState(List<Company> companies1, int state);

    Page<Company> getCompanyByCpyNameAndCpyAddress(String cpyName, String cpyAddress, int currectpage, int limit);

    Page<Temporary> getOccupationByPage(int currectpage, int limit);

    void updateOccupationState(List<Temporary> occupations, int state);






    /*    //事务管理的注解
    @Transactional(propagation = Propagation.REQUIRED)
    void test(int q,int q2);*/
}
