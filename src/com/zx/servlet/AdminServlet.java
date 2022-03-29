package com.zx.servlet;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zx.beans.Company;
import com.zx.beans.Page;
import com.zx.beans.Resume;
import com.zx.beans.Student;
import com.zx.dao.*;
import com.zx.dao.impl.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "AdminServlet", urlPatterns = "/AdminServlet")
public class AdminServlet extends BaseServlet {

    public void getCompanyByIdAndOccupation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String companyid=request.getParameter("companyid");
            System.out.println(companyid);
            OccupationDao occupationDao=new OccupationDaoImpl();
            Company company=occupationDao.occupationByCompanyAdmin(Integer.parseInt(companyid));


        request.setAttribute("company",company);
        request.setAttribute("occupations",company.getOccupations());
        request.getRequestDispatcher("/adminCompanysp.jsp").forward(request,response);

       // request.getRequestDispatcher("/adminCompanyPass.jsp").forward(request,response);

    }





    public void toGoAdminStudentSp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentid=request.getParameter("studentid");


        request.setAttribute("studentid",studentid);
        request.getRequestDispatcher("/adminStudentsp.jsp").forward(request,response);

    }



    public void getStudentByIdAndOccupation(HttpServletRequest request, HttpServletResponse response) throws  IOException {

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

    public void getStudentByIdAdmin(HttpServletRequest request, HttpServletResponse response) throws  IOException {

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




    public void usernameIsSame(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String username=request.getParameter("username");
        AdminDao adminDao=new AdminDaoImpl();
        System.out.println(username);
        boolean judge=adminDao.usernameIsSame(username);
        System.out.println(judge);


        PrintWriter writer=response.getWriter();
        writer.print(judge);
        writer.close();

    }

    public void AdminGetResumeByResumeId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String stresumeid=request.getParameter("stresumeid");
            ResumeDao resumeDao=new ResumeDaoImpl();
            Resume resume=resumeDao.getStudentResume(Integer.parseInt(stresumeid));

            request.setAttribute("resume",resume);
            request.getRequestDispatcher("adminStudentResume.jsp").forward(request,response);

    }
    public void getCompanyByPage(HttpServletRequest request, HttpServletResponse response) throws  IOException {
       String pageNum=request.getParameter("currectpage");
       String pageSize=request.getParameter("limit");
       PageDao pageDao=new PageDaoImpl();
        Page<Company>  page=pageDao.getCompanyByPageAdmin(Integer.parseInt(pageNum),Integer.parseInt(pageSize));

        ObjectMapper objectMapper=new ObjectMapper();
        String json="{\"code\":0,\"msg\":\"\",\"count\": "+page.getDataCount()+ ",\"data\":"+ objectMapper.writeValueAsString(page)+"}";

        //System.out.println(json);

        response.setCharacterEncoding("utf-8");
        PrintWriter writer=response.getWriter();
        writer.print(json);
        writer.close();

    }

    public void getStudentByPage(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String currectpage=request.getParameter("currectpage");
        String limit=request.getParameter("limit");

        PageDao pageDao=new PageDaoImpl();

        Page<Student>  page=pageDao.getStudentByPageAdmin(Integer.parseInt(currectpage),Integer.parseInt(limit));


        ObjectMapper objectMapper=new ObjectMapper();
      //  String json="{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":"+ objectMapper.writeValueAsString(page)+"}";
        String json="{\"code\":0,\"msg\":\"\",\"count\": "+page.getDataCount()+ ",\"data\":"+ objectMapper.writeValueAsString(page)+"}";

    //    System.out.println(json);

        response.setCharacterEncoding("utf-8");
        PrintWriter writer=response.getWriter();
        writer.print(json);
        writer.close();

    }

    public void adminPassCompany(HttpServletRequest request, HttpServletResponse response) throws  IOException {
                String companies=request.getParameter("companies");
                String state=request.getParameter("state");
        //将json字符串转为list数组
       ObjectMapper objectMapper=new ObjectMapper();
       List<Company> companies1=objectMapper.readValue(companies, new TypeReference<List<Company>>(){});
       CompanyDao companyDao=new CompanyDaoImpl();
       for(Company company:companies1){
           companyDao.updateCompanyPass(company.getId(),Integer.parseInt(state));
       }

    }
    


    public void adminRejectCompany(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String companies=request.getParameter("companies");
        String state=request.getParameter("state");
        //将json字符串转为list数组
        ObjectMapper objectMapper=new ObjectMapper();
        List<Company> companies1=objectMapper.readValue(companies, new TypeReference<List<Company>>(){});
        CompanyDao companyDao=new CompanyDaoImpl();
        for(Company company:companies1){
            companyDao.updateCompanyReject(company.getId(),Integer.parseInt(state));
        }

    }

    public void getCompanyByCpyNameByPage(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String  cpyname=request.getParameter("cpyname");
        String cpyaddress=request.getParameter("cpyaddress");
        String currectpage=request.getParameter("currectpage");
        String limit=request.getParameter("limit");
        System.out.println(currectpage);
        System.out.println(limit);

        PageDao pageDao=new PageDaoImpl();

        Page<Company> page=pageDao.selectCompanyByCpyNameOrCpyAddressByPage(Integer.parseInt(currectpage),Integer.parseInt(limit),cpyname,cpyaddress);


        ObjectMapper objectMapper=new ObjectMapper();
        //  String json="{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":"+ objectMapper.writeValueAsString(page)+"}";
        String json="{\"code\":0,\"msg\":\"\",\"count\": "+page.getDataCount()+ ",\"data\":"+ objectMapper.writeValueAsString(page)+"}";

        //    System.out.println(json);

        response.setCharacterEncoding("utf-8");
        PrintWriter writer=response.getWriter();
        writer.print(json);
        writer.close();

    }







}
