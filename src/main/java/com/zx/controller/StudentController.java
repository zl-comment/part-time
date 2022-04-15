package com.zx.controller;

import com.zx.beans.Resume;
import com.zx.beans.Student;
import com.zx.service.StudentService;
import com.zx.service.impl.StudentServiceImpl;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller("studentController")
public class StudentController {

    @Resource
    private StudentService studentService;

    //初始化绑定方法
    @InitBinder
    public  void initBinder(WebDataBinder binder, HttpServletRequest request){
        System.out.println(request.getParameter("date"));
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("MM-dd-yyyy"),false));
    }


    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/staccountIsSame")
    public @ResponseBody String staccountIsSame(String staccount){
    //public void  staccountIsSame(String staccount, HttpServletResponse response) throws IOException {
        System.out.println(staccount);
        Integer i=studentService.IsSame(staccount);
        if (i!=null){
             return true+"";
        }else {
            return false+"";
        }

       /* PrintWriter writer=response.getWriter();
        writer.println(true);
        writer.close();*/

    }

    @RequestMapping("/StudentRegister")
    public String StudentRegister(Student student){

        studentService.studentRegister(student.getStaccount(),student.getStpassword(),student.getStphone(),student.getStschool(),student.getStmajor(),student.getStsystem(),student.getStdate());

        return "login";

    }


    @RequestMapping("/updateinfoStudent")
    public String updateinfoStudent(Student student,Date date){

        studentService.updateinfoStudent(student,date);
        return "update_student_info";

    }

    @RequestMapping("/createResume")
    public String createResume(Resume resume){

        studentService.createResume(resume);
        return "StudentResume";
    }



}



