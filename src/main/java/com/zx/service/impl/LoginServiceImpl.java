package com.zx.service.impl;


import com.zx.dao.AdminDao;
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


    private AdminDao adminDao;


    @Override
    public int adminLogin(String usercode,String password) {

        adminDao=sqlSessionTemplate.getMapper(AdminDao.class);


    return 0;


    }


    @Override
    public void add() {

        System.out.println("登录");
    }
}
