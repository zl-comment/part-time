package com.zx.controller;



import com.zx.beans.Company;
import com.zx.service.CompanyService;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@SessionAttributes("name")
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



    //初始化绑定方法
    @InitBinder
    public  void initBinder(WebDataBinder binder, HttpServletRequest request){
        System.out.println(request.getParameter("date"));
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("MM-dd-yyyy"),false));
    }


    @ExceptionHandler(value={Exception.class})
    public String handlerException(Exception e){
        System.out.println("出现异常错误");
        e.printStackTrace();
        return "404";
    }





}
