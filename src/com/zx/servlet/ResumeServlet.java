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
        if (id == null){
            //创造建立
        }else {
            ResumeDao resumeDao = new ResumeDaoImpl();
           Resume resume= resumeDao.getStudentResume(Integer.parseInt(id));
            System.out.println(1);
                request.setAttribute("resume",resume);
            request.getRequestDispatcher("studentResume.jsp").forward(request, response);
        }
    }


}

