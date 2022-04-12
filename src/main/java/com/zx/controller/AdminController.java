package com.zx.controller;

import com.zx.service.AdminService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
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







}
