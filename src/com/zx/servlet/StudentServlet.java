package com.zx.servlet;

import com.zx.beans.Occupation;
import com.zx.beans.Student;
import com.zx.dao.OccupationDao;
import com.zx.dao.StudentDao;
import com.zx.dao.impl.OccupationDaoImpl;
import com.zx.dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        request.getRequestDispatcher("Login.jsp").forward(request,response);
    }

    public void updateinfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String staccount = request.getParameter("staccount");
        String stpassword = request.getParameter("stpassword");
        String stphone = request.getParameter("stphone");
        String stschool = request.getParameter("stschool");
        String stmajor = request.getParameter("stmajor");
        String stsystem = request.getParameter("stsystem");
        String stdate = request.getParameter("stdate");

        System.out.println(stphone);
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date=sf.parse(stdate);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Student student = new Student(staccount,stpassword,stphone,stschool,stmajor,Integer.parseInt(stsystem),date);

        StudentDao studentDao = new StudentDaoImpl();
        studentDao.updateinfo(student);
        request.getRequestDispatcher("update_student_info.jsp").forward(request,response);
    }


    public void getOccupations(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String studentid=request.getParameter("studentid");
        OccupationDao occupationDao = new OccupationDaoImpl();
        Student student = occupationDao.getOccupationsStudent(Integer.parseInt(studentid));


//        System.out.println(occupations);

        request.setAttribute("occupations",student.getOccupations());
        request.setAttribute("studentid",studentid);
        request.getRequestDispatcher("studentOccupations.jsp").forward(request,response);
    }

    public void deleteOccupationsByIdStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentid = request.getParameter("studentid");
        String stuandocid = request.getParameter("stuandocid");
        OccupationDao occupationDao = new OccupationDaoImpl();
        occupationDao.deleteOccupationsByIdStudent(Integer.parseInt(stuandocid));
        Student student = occupationDao.getOccupationsStudent(Integer.parseInt(studentid));

        request.setAttribute("occupations",student.getOccupations());
        request.setAttribute("studentid",studentid);
        request.getRequestDispatcher("studentOccupations.jsp").forward(request,response);


    }

}
