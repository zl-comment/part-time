package com.zx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import java.util.ArrayList;
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
    public Page<Company> getCompanyList( int pagenum,  int pagesize) {
        PageDao pageDao=sqlSessionTemplate.getMapper(PageDao.class);
        Page<Company> page=new Page<>();

        PageHelper.startPage(pagenum,pagesize);
        List<Company> companies=pageDao.getAllCompanyAdmin();   //这两步不可分开，否则数据丢失
        PageInfo<Company> pageInfo=new PageInfo<>(companies);   //这两步不可分开，否则数据丢失
        page.setCount((int)pageInfo.getTotal());      //获得数据总数
        List<Company> list=new ArrayList<>(companies);   //获得查询数据真正集合
        pageInfo.setList(list);    //将集合真正放入pageInfo
        page.setData(pageInfo);    //将pageInfo放入page
        System.out.println(page);
        return page;
    }




}
