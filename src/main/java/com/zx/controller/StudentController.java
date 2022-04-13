package com.zx.controller;

import com.zx.service.StudentService;
import com.zx.service.impl.StudentServiceImpl;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller("studentController")
public class StudentController {

    @Resource
    private StudentService studentService;


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




}



