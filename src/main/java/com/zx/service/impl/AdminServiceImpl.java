package com.zx.service.impl;

import com.zx.beans.Company;
import com.zx.beans.Page;
import com.zx.dao.AdminDao;
import com.zx.dao.CompanyDao;
import com.zx.dao.PageDao;
import com.zx.service.AdminService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service//使用控制反转时创建对象时首字母小写对于Servie注解反转的
public class AdminServiceImpl  implements AdminService {


    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }




    @Override
    public int adminLogin(String usercode,String password) {

        AdminDao adminDao= sqlSessionTemplate.getMapper(AdminDao.class);

        int a=adminDao.login(usercode,password);

        return a;

    }

    @Override
    public Page<Company> adminCompanyByPage( int pagenum,  int pagesize) {
        PageDao pageDao=sqlSessionTemplate.getMapper(PageDao.class);
        CompanyDao companyDao=sqlSessionTemplate.getMapper(CompanyDao.class);
        int cuurentPage=((pagenum-1)*pagesize);
        List<Company> companies=pageDao.getCompanyByPageAdmin(cuurentPage,pagesize);
        int dataCount=companyDao.getCompanyCountAdmin();
        Page<Company> page=new Page<>();
        page.setCurrentPage(cuurentPage);
        page.setDataCount(dataCount);
        page.setPageSize(pagesize);
        page.setPageCount(dataCount % pagesize == 0 ? (dataCount / pagesize) : ((dataCount / pagesize) + 1));
        page.setDatas(companies);

        System.out.println(page);
        return page;
    }




}
