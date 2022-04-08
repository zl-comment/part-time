package com.zx.service.impl;

import com.zx.dao.StudentDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class StudentServiceImpl {


    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

   private StudentDao studentDao;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }


    public  void test(){
        studentDao =sqlSessionTemplate.getMapper(StudentDao.class);
        Date date=new Date();
        java.sql.Date date1=new java.sql.Date(date.getTime());
        studentDao.Register("st","st","12345678901","山大","软工",4,date1);
    }


}
