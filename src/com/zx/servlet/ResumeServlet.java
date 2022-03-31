package com.zx.servlet;

import com.zx.beans.Resume;
import com.zx.dao.ResumeDao;
import com.zx.dao.impl.ResumeDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ResumeServlet", urlPatterns = "/ResumeServlet")
public class ResumeServlet extends BaseServlet{

    public void getStudentResumeById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println(id.getClass().getSimpleName());
        System.out.println(Integer.parseInt(id));
        if (Integer.parseInt(id) == 0){
            request.getRequestDispatcher("jianli.jsp").forward(request,response);
        }else {
            ResumeDao resumeDao = new ResumeDaoImpl();
            Resume resume= resumeDao.getStudentResume(Integer.parseInt(id));
            request.setAttribute("resume",resume);
            request.getRequestDispatcher("studentResume.jsp").forward(request, response);
        }
    }

    public void createResume(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        String imaurl = request.getParameter("imaurl");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String hobby = request.getParameter("hobby");
        String major = request.getParameter("major");
        String workExperience = request.getParameter("workExperience");
        String selfEvaluation = request.getParameter("selfEvaluation");

        ResumeDao resumeDao = new ResumeDaoImpl();
        resumeDao.createResume(name,gender,age,imaurl,address,phone,email,hobby,major,workExperience,selfEvaluation);
        request.getRequestDispatcher("StudentResume.jsp").forward(request,response);














        //        Resume resume = new Resume(name);

//        Resume resume = new Resume(name,age,imaurl,address,phone,email,hobby,major,workExperience,selfEvaluation);
//        ResumeDao resumeDao = new ResumeDaoImpl();
//        resumeDao.createResume(resume);
//        getStudentResumeById(request,response);
    }



}

