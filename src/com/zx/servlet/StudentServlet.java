package com.zx.servlet;

import com.zx.beans.Occupation;
import com.zx.beans.Page;
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


    public void getStudentInfoById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        /*String currentPage = request.getParameter("currentPage");
        if (currentPage == null){
            currentPage = "1";
        }*/
        StudentDao studentDao = new StudentDaoImpl();
//        Page<Occupation> page = occupationDao.getOccupationsStudentByPage(Integer.parseInt(currentPage),1,Integer.parseInt(studentid));
        Student student = studentDao.getStudentInfoById(Integer.parseInt(id));

//        request.setAttribute("student",student);
        request.setAttribute("id",id);
//        System.out.println(student);
        request.getRequestDispatcher("update_student_info.jsp").forward(request,response);
    }

    public void updateinfoStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String staccount = request.getParameter("staccount");
        String stpassword = request.getParameter("stpassword");
        String stphone = request.getParameter("stphone");
        String stschool = request.getParameter("stschool");
        String stmajor = request.getParameter("stmajor");
        String stsystem = request.getParameter("stsystem");
        String stdate = request.getParameter("stdate");
        System.out.println(stdate);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sf.parse(stdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Student student = new Student(Integer.parseInt(id),staccount,stpassword,stphone,stschool,stmajor,Integer.parseInt(stsystem),date);
        System.out.println(student);
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.updateinfoStudent(student);

        request.setAttribute("id",id);

        request.getRequestDispatcher("update_student_info.jsp").forward(request,response);
    }



    public void getOccupations(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        /*String currentPage = request.getParameter("currentPage");
        if (currentPage == null){
            currentPage = "1";
        }*/
        OccupationDao occupationDao = new OccupationDaoImpl();
//        Page<Occupation> page = occupationDao.getOccupationsStudentByPage(Integer.parseInt(currentPage),1,Integer.parseInt(studentid));
        Student student = occupationDao.getOccupationsStudent(Integer.parseInt(id));

        request.setAttribute("occupations",student.getOccupations());
        request.setAttribute("studentid",id);
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
