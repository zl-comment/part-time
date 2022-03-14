package com.zx.servlet;

import com.zx.beans.Student;
import com.zx.dao.StudentDao;
import com.zx.dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "StudentServlet", urlPatterns = "/StudentServlet")
public class StudentServlet extends BaseServlet {
    public void Register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String staccount = request.getParameter("staccount");
        String stpassword = request.getParameter("stpassword");
        String stphone = request.getParameter("stphone");
        String stschool = request.getParameter("stschool");
        String stmajor = request.getParameter("stmajor");
        String stsystem = request.getParameter("stsystem");
        String stdate = request.getParameter("stdate");

        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date=sf.parse(stdate);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        StudentDao studentDao = new StudentDaoImpl();
        studentDao.Register(staccount,stpassword,stphone,stschool,stmajor,Integer.parseInt(stsystem),date);



        request.getRequestDispatcher("login.jsp").forward(request,response);


    }


}
