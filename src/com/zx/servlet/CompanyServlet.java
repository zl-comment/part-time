package com.zx.servlet;


import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;
import com.zx.dao.CompanyDao;
import com.zx.dao.OccupationDao;
import com.zx.dao.impl.CompanyDaoImpl;
import com.zx.dao.impl.OccupationDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;
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

    public void getCompanyById(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String companyid=request.getParameter("companyid");
        System.out.println("11111111111");
        System.out.println(companyid);
        CompanyDao companyDao = new CompanyDaoImpl();
        Company company = companyDao.getCompanyById(Integer.parseInt(companyid));

        request.setAttribute("company",company);
        request.getRequestDispatcher("/Companyquery.jsp").forward(request,response);
    }
    public void updateCompanyById(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        System.out.println("333333");
        String companyid = request.getParameter("companyid");
        String cpyname = request.getParameter("cpyname");
        String cpyaccount = request.getParameter("cpyaccount");
        String cpypassword = request.getParameter("cpypassword");
        String cpyphone = request.getParameter("cpyphone");
        String cpyaddress = request.getParameter("cpyaddress");
        String cpyinfo = request.getParameter("cpyinfo");
        Company company = new Company(Integer.parseInt(companyid),cpyname,cpyaccount,cpypassword,cpyphone,cpyaddress,cpyinfo);
        System.out.println(company);
        System.out.println("222222222");


        CompanyDao companyDao = new CompanyDaoImpl();
        companyDao.updateCompanyById(company);

        request.setAttribute("company",company);
        request.getRequestDispatcher("/Companyquery.jsp").forward(request,response);

    }

    public void getAdmissionById(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String companyid=request.getParameter("companyid");
        CompanyDao companyDao = new CompanyDaoImpl();
        ArrayList<Student> students = companyDao.getAdmissionById(Integer.parseInt(companyid));

        System.out.println(students);
        request.setAttribute("companyid",companyid);
        request.setAttribute("students",students);
        request.getRequestDispatcher("/Admission.jsp").forward(request, response);
    }





}
