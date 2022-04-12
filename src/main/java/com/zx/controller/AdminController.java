package com.zx.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zx.beans.Company;
import com.zx.beans.Page;
import com.zx.service.AdminService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
@Controller("adminController")
@SessionAttributes("name")
public class AdminController {

    @Resource
    private AdminService adminService;

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("getCompanyList")
    public @ResponseBody
    Object  getCompanyList(int currectpage, int limit) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Page<Company> page = adminService.getCompanyList(currectpage, limit);
      String json=  mapper.writeValueAsString(page);
        System.out.println(json);
        return adminService.getCompanyList(currectpage,limit);
    }





}
