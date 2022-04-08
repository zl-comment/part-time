package com.zx.service;

import com.zx.beans.Company;
import com.zx.beans.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public interface AdminService {
    int adminLogin(String usercode,String password);

    Page<Company> adminCompanyByPage( int pagenum,  int pagesize);






        //事务管理的注解
    @Transactional(propagation = Propagation.REQUIRED)
    void test(int q,int q2);
}
