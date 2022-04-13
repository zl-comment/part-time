package com.zx.service;

import com.zx.beans.Admin;
import com.zx.beans.Company;
import com.zx.beans.Page;
import com.zx.beans.Permission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface AdminService {
    Admin adminLogin(String usercode, String password);

    Page<Company> getCompanyList( int pagenum,  int pagesize);

    List<Permission> selectPermission(int roleid);






    /*    //事务管理的注解
    @Transactional(propagation = Propagation.REQUIRED)
    void test(int q,int q2);*/
}
