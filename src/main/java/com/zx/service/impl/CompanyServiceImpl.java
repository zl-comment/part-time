package com.zx.service.impl;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;
import com.zx.dao.CompanyDao;
import com.zx.service.CompanyService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    private CompanyDao companyDao;


    @Override
    public int companyLogin(String usercode, String password) {
        CompanyDao companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);

         int     a=companyDao.login(usercode,password);

        return a;
    }

    @Override
    public void companyRegister(String cpyaccount, String cpypassword, String cpyname, String cpyphone, String cpyaddress, String cpyinfo) {


        companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
        companyDao.Register(cpyaccount,cpypassword,cpyname,cpyphone,cpyaddress,cpyinfo);

    }

    @Override
    public void companyUpdate(Company company) {
         companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
        companyDao.updateCompanyById(company);
    }

 /*   @Override
    public List<Occupation> companygetAdmissionById(int companyid) {
        CompanyDao companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
       return  companyDao.getAdmissionById(companyid);

    }  */  @Override
    public List<Student> companyGetAdmissionById(int companyid) {
         companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
       return  companyDao.getAdmissionById(companyid);

    }

    @Override
    public void login() {

        System.out.println("登录");
    }
}
