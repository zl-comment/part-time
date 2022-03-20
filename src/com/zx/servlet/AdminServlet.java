package com.zx.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zx.beans.Company;
import com.zx.beans.Student;
import com.zx.dao.AdminDao;
import com.zx.dao.CompanyDao;
import com.zx.dao.OccupationDao;
import com.zx.dao.StudentDao;
import com.zx.dao.impl.AdminDaoImpl;
import com.zx.dao.impl.CompanyDaoImpl;
import com.zx.dao.impl.OccupationDaoImpl;
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
        List<Student> students= studentDao.getStudentsAdmin();
        request.setAttribute("students",students);
        request.getRequestDispatcher("/adminStudentList.jsp").forward(request,response);

    }

    public void getCompanies(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CompanyDao companyDao=new CompanyDaoImpl();
        ArrayList<Company> companies=companyDao.getCompanysAdmin();
        request.setAttribute("companies",companies);
        request.getRequestDispatcher("/adminCompaniesList.jsp").forward(request,response);

    }
    public void getCompanyByIdAndOccupation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String companyid=request.getParameter("companyid");
            System.out.println(companyid);
            OccupationDao occupationDao=new OccupationDaoImpl();
            Company company=occupationDao.occupationByCompanyAdmin(Integer.parseInt(companyid));


        request.setAttribute("company",company);
        request.setAttribute("occupations",company.getOccupations());
        request.getRequestDispatcher("/adminCompanysp.jsp").forward(request,response);

    }





    public void toGoAdminStudentSp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentid=request.getParameter("studentid");


        request.setAttribute("studentid",studentid);
        request.getRequestDispatcher("/adminStudentsp.jsp").forward(request,response);

    }



    public void getStudentByIdAndOccupation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String studentid=request.getParameter("studentid");      //可以得到
        OccupationDao occupationDao=new OccupationDaoImpl();
        Student student=occupationDao.occupationByStudentAdmin(Integer.parseInt(studentid));



        ObjectMapper objectMapper=new ObjectMapper();
        String json=objectMapper.writeValueAsString(student.getOccupations());

        //String jsons="["+json +"]";

        //System.out.println(json);
        response.setCharacterEncoding("utf-8");


        System.out.println(json);
        PrintWriter writer=response.getWriter();
     //   writer.print("["+json+"]");
        writer.print(json);
        writer.close();
    }

    public void getStudentByIdAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String studentid=request.getParameter("studentid");      //可以得到
        StudentDao studentDao=new StudentDaoImpl();
        Student student=studentDao.getStudentByIdAdmin(Integer.parseInt(studentid));

        ObjectMapper objectMapper=new ObjectMapper();
        String json=objectMapper.writeValueAsString(student);




        response.setCharacterEncoding("utf-8");


        System.out.println("["+json+"]");
        PrintWriter writer=response.getWriter();

        writer.print("["+json+"]");
        writer.close();
    }




    public void usernameIsSame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        AdminDao adminDao=new AdminDaoImpl();
        System.out.println(username);
        boolean judge=adminDao.usernameIsSame(username);
        System.out.println(judge);


        PrintWriter writer=response.getWriter();
        writer.print(judge);
        writer.close();

    }






}
