package com.zx.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("拦截器");

        //登录拦截
        String username = httpServletRequest.getParameter("usercode");
        String password = httpServletRequest.getParameter("password");
     /*   if (username.equals("admin") && password.equals("123456")) {
            return true;
        }*/
        return true;

       //返回true，则放行，进入控制器 返回false，则拦截，不进入控制器
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
