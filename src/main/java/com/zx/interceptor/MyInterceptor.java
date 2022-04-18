package com.zx.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    //控制器之前执行
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws IOException {
        System.out.println("preHandle");
        String url=httpServletRequest.getRequestURI();
        HttpSession session = httpServletRequest.getSession();
        System.out.println("url:"+url);
        if(url.contains("adminlogin")){   //url中存在login
            // 要给控制器传送数据因此放行
            System.out.println(1);
            return true;
        }if(url.contains("login")){   //url中存在login
            // 要给控制器传送数据因此放行
            System.out.println(2);
            return true;
        }if (session.getAttribute("user")!=null){
            System.out.println(4);
            return true;
        } if(url.contains("Same")){   //url中存在login
            // 要给控制器传送数据因此放行
            System.out.println(6);
            return true;
        }if(url.contains("Register")){   //url中存在login
            // 要给控制器传送数据因此放行
            System.out.println(7);
            return true;
        }
        else {
            System.out.println(5);
            httpServletResponse.sendRedirect("allLogin.jsp");
            return false;  //返回true，则放行，进入控制器 返回false，则拦截，不进入控制器
        }

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
