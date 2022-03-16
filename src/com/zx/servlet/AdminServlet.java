package com.zx.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zx.beans.Company;
import com.zx.beans.Student;
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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AdminServlet", urlPatterns = "/AdminServlet")
public class AdminServlet extends BaseServlet {


    public void getStudents(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StudentDao studentDao=new StudentDaoImpl();
     List<Student> students= studentDao.getStudents();

     request.setAttribute("students",students);
     request.getRequestDispatcher("/adminStudentList.jsp").forward(request,response);




    }
    public void getCompanies(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        CompanyDao companyDao=new CompanyDaoImpl();
        ArrayList<Company> companies=companyDao.getCompanys();


        request.setAttribute("companies",companies);
        request.getRequestDispatcher("/adminCompaniesList.jsp").forward(request,response);



    }


}
