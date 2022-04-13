package com.zx.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)  {
 /*       System.out.println("拦截器");
        //1.定义sessionid变量
        String sessionid = "";
        //2.获取session对象
        HttpSession session = httpServletRequest.getSession();
        //3.获取页面上所有的cookie
        Cookie[] cookies = httpServletRequest.getCookies();
        //4.循环寻找名称为"JSESSIONID"的cookie
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("JSESSIONID")) {
                sessionid = cookie.getValue();
            }
        }
        //5.根据sessionid获取用户信息
        String usercode = (String) session.getAttribute(sessionid);
        if (usercode.isEmpty()) {
            //6.如果用户信息为空，则跳转到登录页面
            //用户未登录跳转到登录页面
            httpServletResponse.sendRedirect("login.jsp");
            return true;
        }
*/
        return true;  //返回true，则放行，进入控制器 返回false，则拦截，不进入控制器
    }




   /* @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("控制器之后，页面之前");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("页面之后");
    }*/
}
