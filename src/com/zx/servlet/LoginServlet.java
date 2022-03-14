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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends BaseServlet{

    public   void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usercode=request.getParameter("usercode");
        String password=request.getParameter("password");

     HttpSession session= request.getSession();
        StudentDao studentDao=new StudentDaoImpl();
        CompanyDao companyDao=new CompanyDaoImpl();
        AdminDao adminDao=new AdminDaoImpl();

       Student  student = studentDao.login(usercode,password);
       Company company=companyDao.login(usercode,password);
       Admin admin=adminDao.login(usercode,password);

        if(admin!=null){

            session.setAttribute("admin",admin);
           response.sendRedirect("adminHome.jsp");
        } else if(student!=null){

            session.setAttribute("student",student);
            response.sendRedirect("index.html");
        }else if(company!=null){

            session.setAttribute("company",company);
            response.sendRedirect("index.html");
        }else {

            request.getRequestDispatcher("login.jsp").forward(request,response);
        }


    }


}
