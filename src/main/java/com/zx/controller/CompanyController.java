package com.zx.controller;

import com.zx.service.CompanyService;
import com.zx.service.impl.CompanyServiceImpl;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CompanyController {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
    @Resource
    private CompanyService companyService;

    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public void login(){

        companyService.login();

    }

    public void test(int i){
        System.out.println(  companyService.companyGetAdmissionById(i));
    }


}
