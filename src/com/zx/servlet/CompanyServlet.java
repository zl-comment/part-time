package com.zx.servlet;


import com.zx.dao.CompanyDao;
import com.zx.dao.StudentDao;
import com.zx.dao.impl.CompanyDaoImpl;
import com.zx.dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CompanyServlet", urlPatterns = "/CompanyServlet")
public class CompanyServlet extends BaseServlet {

    public void Register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String cpyaccount = request.getParameter("cpyaccount");
        String cpypassword = request.getParameter("cpypassword");
        String cpypassword1 = request.getParameter("cpypassword1");
        String cpyname = request.getParameter("cpyname");
        String cpyphone = request.getParameter("cpyphone");
        String cpyaddress = request.getParameter("cpyaddress");
        String cpyinfo = request.getParameter("cpyinfo");
        System.out.println(cpyaccount);
        System.out.println(cpypassword);
        System.out.println(cpypassword1);
        System.out.println(cpyname);
        System.out.println(cpyphone);
        System.out.println(cpyaddress);
        System.out.println(cpyinfo);
        CompanyDao companyDao = new CompanyDaoImpl();
        companyDao.Register(cpyaccount, cpypassword, cpyname, cpyphone, cpyaddress, cpyinfo);


    }


    public void cpyaccountIsSame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cpyaccount=request.getParameter("cpyaccount");
        CompanyDao companyDao=new CompanyDaoImpl();

        System.out.println(cpyaccount);
        boolean judge=companyDao.cpyaccountIsSame(cpyaccount);
        System.out.println(judge);



        PrintWriter writer=response.getWriter();
        writer.print(judge);
        writer.close();
    }


}
