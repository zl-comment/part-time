package com.zx.service.impl;



import com.zx.dao.StudentDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



@Service
public class StudentServiceImpl implements com.zx.service.StudentService {


    @Resource
    private SqlSessionTemplate sqlSessionTemplate;



    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    @Override
    public Integer IsSame(String staccount) {
     StudentDao  studentDao = sqlSessionTemplate.getMapper(StudentDao.class);
        return studentDao.staccountIsSame(staccount);


    }
}
