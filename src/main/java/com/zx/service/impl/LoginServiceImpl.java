package com.zx.service.impl;


import com.zx.beans.Company;
import com.zx.beans.Student;
import com.zx.dao.AdminDao;
import com.zx.dao.CompanyDao;
import com.zx.dao.StudentDao;
import com.zx.service.LoginService;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {


    private SqlSessionTemplate sqlSessionTemplate;
    @Resource
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }


    private StudentDao studentDao;
    private CompanyDao companyDao;

    @Override
    public Object Login(String usercode, String password) {
        studentDao = sqlSessionTemplate.getMapper(StudentDao.class);
        companyDao = sqlSessionTemplate.getMapper(CompanyDao.class);
        Student student=studentDao.login(usercode,password);
        Company company=companyDao.login(usercode,password);
        if(student!=null){
            return student;
        }
        if(company!=null){
            return company;
        }
        return null;
    }
}
