package com.zx.controller;


import com.zx.beans.Company;
import com.zx.beans.Student;
import com.zx.service.LoginService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller("loginController")
@SessionAttributes("user")
public class LoginController {
    @Resource
    private LoginService loginService;

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("login")
    public String login(String usercode,String password,HttpServletRequest request, HttpServletResponse response) {
        System.out.println(usercode+" "+password);
       Object object =  loginService.Login(usercode,password);
       if(object!=null){
           //1.获取session
           HttpSession session = request.getSession();
           //2.获取sessionid
           String sessionId = session.getId();
           if (object instanceof Student) {
               Student student = (Student) object;
               System.out.println(student);
               System.out.println("学生登录成功");
               //3.将sessionid作为key，用户信息user作为value，放入session中
               session.setAttribute(sessionId,usercode);
               //4.将sessionId存到cookie中,"JSESSIONID"为自定义的key值
               Cookie cookie = new Cookie("JSESSIONID",sessionId);
               //5.设置cookie的有效路径
               cookie.setPath(request.getContextPath());
               //6.将cookie返回给页面
               response.addCookie(cookie);
               session.setAttribute("user",student);
               System.out.println(session);
               return "redirect:allHome.jsp";

           }else if (object instanceof Company) {
               Company company = (Company) object;
               System.out.println(company);
               System.out.println("企业登录成功");
               //3.将sessionid作为key，用户信息user作为value，放入session中
               session.setAttribute(sessionId,usercode);
               //4.将sessionId存到cookie中,"JSESSIONID"为自定义的key值
               Cookie cookie = new Cookie("JSESSIONID",sessionId);
               //5.设置cookie的有效路径
               cookie.setPath(request.getContextPath());
               //6.将cookie返回给页面
               response.addCookie(cookie);
               session.setAttribute("user",company);
               System.out.println(session);
               return "redirect:allHome.jsp";
           }
       }else
           System.out.println("登录失败");
           return "login";

    }
    @RequestMapping("myInformation")
    public  String myInformation( HttpServletRequest request, Model model){
        Object user=  request.getSession().getAttribute("user");   //获取session中的user
        if (user !=null){
            System.out.println(user);
            model.addAttribute("user",user);
            return "redirect:allmain.jsp";
        }
        else {
            System.out.println("没有登录");
            return "redirect:login.jsp";
        }
    }





}
