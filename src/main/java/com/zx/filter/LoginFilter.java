package com.zx.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 2020/3/2 10:27
 */
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //过滤器出生
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("过滤器开始执行");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String url = request.getRequestURI();
        if(session.getAttribute("user") == null){
            if(url.contains("adminlogin")){
                System.out.println("管理员登录");
                filterChain.doFilter(servletRequest,servletResponse);
            }
            else if(url.contains("login")){
                System.out.println("用户登录");
                filterChain.doFilter(servletRequest,servletResponse);
            }
            else if(url.contains("allmain")){
                System.out.println("非法进入");
            }
            else if (url.contains("adminHome")){
                System.out.println("非法进入后台");
            }
            else{
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }
        else{
            System.out.println("用户已登录");
            filterChain.doFilter(servletRequest,servletResponse);
        }



    }

    @Override
    public void destroy() {

    }
}
