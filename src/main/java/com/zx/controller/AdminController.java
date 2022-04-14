package com.zx.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zx.beans.*;
import com.zx.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller("adminController")
@SessionAttributes("admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

   /* @RequestMapping("login")
    public String login(String usercode, String password, HttpServletResponse response, HttpServletRequest request){

       Admin admin= adminService.adminLogin(usercode,password);
        if(admin!=null){
            //1.获取session
            HttpSession session = request.getSession();
            //2.获取sessionid
            String sessionId = session.getId();
            //3.将sessionid作为key，用户信息user作为value，放入session中
            session.setAttribute(sessionId,usercode);
            //4.将sessionId存到cookie中,"JSESSIONID"为自定义的key值
            Cookie cookie = new Cookie("JSESSIONID",sessionId);
            //5.设置cookie的有效路径
            cookie.setPath(request.getContextPath());
            //6.将cookie返回给页面
            response.addCookie(cookie);
            session.setAttribute("admin",admin);
            System.out.println(session);
           return "redirect:adminHome.jsp";

        }else{
            System.out.println("登录失败");
            return "login";
        }

    }*/
    @RequestMapping("selectPermission")
    public @ResponseBody Object selectPermission(int Roleid){
        System.out.println(Roleid);
        System.out.println(adminService.selectPermission(Roleid));
        return adminService.selectPermission(Roleid );
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
