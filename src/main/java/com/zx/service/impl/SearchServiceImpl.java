package com.zx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.beans.Occupation;
import com.zx.beans.Page;
import com.zx.dao.SearchDao;
import com.zx.service.SearchService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    private SqlSessionTemplate sqlSessionTemplate;
    @Resource
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    private SearchDao searchDao;

    @Override
    public Page<Occupation> search(String data, String ocname, String salary, String requirement,int currectpage) {
        searchDao= sqlSessionTemplate.getMapper(SearchDao.class);
        Page<Occupation> page = new Page<>();
        PageHelper.startPage(currectpage,5);
        List<Occupation> occupations = searchDao.searchOccupation(data,ocname,salary,requirement);
        PageInfo<Occupation> pageInfo=new PageInfo<>(occupations);   //这两步不可分开，否则数据丢失
        page.setCount((int)pageInfo.getTotal());      //获得数据总数
        List<Occupation> list=new ArrayList<>(occupations);   //获得查询数据真正集合
        pageInfo.setList(list);    //将集合真正放入pageInfo
        page.setData(pageInfo);    //将pageInfo放入page
        System.out.println(page);
        return page;
    }



}
