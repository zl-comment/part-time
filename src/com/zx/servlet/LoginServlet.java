package com.zx.servlet;

import com.zx.beans.Admin;
import com.zx.beans.Company;
import com.zx.beans.Student;
import com.zx.dao.AdminDao;
import com.zx.dao.CompanyDao;
import com.zx.dao.StudentDao;
import com.zx.dao.impl.AdminDaoImpl;
import com.zx.dao.impl.CompanyDaoImpl;
import com.zx.dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends BaseServlet{

    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usercode=request.getParameter("usercode");
        String password=request.getParameter("password");

        HttpSession session= request.getSession();
        StudentDao studentDao=new StudentDaoImpl();
        CompanyDao companyDao=new CompanyDaoImpl();
        AdminDao adminDao=new AdminDaoImpl();

        String  student = studentDao.login(usercode,password);
        String company=companyDao.login(usercode,password);
        Admin admin=adminDao.login(usercode,password);

        if(admin!=null){
            session.setAttribute("admin",admin);
            response.sendRedirect("adminHome.jsp");
        } else if(student!=null){

            session.setAttribute("username",student);
            response.sendRedirect("allHome.jsp");
        }else if(company!=null){

            session.setAttribute("username",company);
            response.sendRedirect("allHome.jsp");
        }else {


            request.setAttribute("error","用户名或密码错误");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }








    public void mainHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");

        HttpSession session= request.getSession();
        StudentDao studentDao=new StudentDaoImpl();
        CompanyDao companyDao=new CompanyDaoImpl();

        Student  student = studentDao.loginHome(username);
        Company company=companyDao.loginHome(username);

        if(student!=null){
            session.setAttribute("student",student);
            response.sendRedirect("Studentmain.jsp");
        }else if(company!=null){

            session.setAttribute("company",company);
            response.sendRedirect("Cpymain.jsp");
        }else {

            request.setAttribute("error","请先登录");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }




}
