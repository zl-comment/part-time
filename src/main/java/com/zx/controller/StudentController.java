package com.zx.controller;

import com.zx.beans.Occupation;
import com.zx.beans.Resume;
import com.zx.beans.Student;
import org.springframework.ui.Model;
import com.zx.service.StudentService;
import com.zx.service.impl.StudentServiceImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

        studentService.studentRegister(student);

        return "allLogin";

    }


    @RequestMapping("updateinfoStudent")
    public String updateinfoStudent(Student student,HttpServletRequest request,Model model){
       String stdate=request.getParameter("stdate");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sf.parse(stdate);
        } catch (ParseException e) {
            e.printStackTrace();


        }
        studentService.updateinfoStudent(student,date);
        student.setStdate(date);   //更新session中的时间
        model.addAttribute("student",student);
        //System.out.println(student1);
        return "update_student_info";
    }

    @RequestMapping("/createResume")
    public String createResume(HttpServletRequest request,Resume resume){
        Object object=request.getSession().getAttribute("user");
       Resume resume1= studentService.createResume(((Student)object).getId(),resume);
        HttpSession session = request.getSession();
        ((Student) object).setStresumeid(resume1.getId());
        session.setAttribute("user",object);
        request.setAttribute("resume",resume1);
        return "studentResume";
    }


    @RequestMapping("/getStudentInfoById")
    public String getStudentInfoById(HttpServletRequest request ){
        Object object=request.getSession().getAttribute("user");
        Student student = studentService.getStudentInfoById(((Student)object).getId());
        request.setAttribute("student",student);
        return "update_student_info";
    }

    @RequestMapping("/getStudentResumeById")
    public String getStudentResumeById(HttpServletRequest request ){
        Object object=request.getSession().getAttribute("user");
        System.out.println(((Student) object).getStresumeid());
        if(((Student) object).getStresumeid()==0){
            return "jianli";
        }else {
            Resume resume = studentService.getStudentResumeById(((Student)object).getStresumeid());
            request.setAttribute("resume",resume);
            return "studentResume";
        }

    }

    /*@RequestMapping("/getOccupations")
    public String getOccupations(int id){

        Student student = studentService.getStudentInfoById(id);
        return "update_student_info";
    }*/

    @RequestMapping("SignUp")
    public String SignUp(int  ocid, HttpServletRequest request){
        Object object=request.getSession().getAttribute("user");
        if (object instanceof Student){
            Student student = (Student) object;
            System.out.println(ocid);
            System.out.println(student);
            studentService.insertStuandoc(student.getId(),ocid,student.getStresumeid());
            request.setAttribute("ocid",ocid);
            return "success";
        }else {
            System.out.println("无法报名");
            return "error";
        }
    }


    @RequestMapping("/getOccupationByOcid")
    public @ResponseBody Object getOccupationByOcid(int ocid,HttpServletRequest request){
        Student student=(Student)request.getSession().getAttribute("user");
        Occupation occupation = studentService.getOccupationByOcid(ocid,student.getId());
        return occupation;
    }

    @RequestMapping("/getHistory")
    public String getHistory(Model model,HttpServletRequest request){
        Student student=(Student)request.getSession().getAttribute("user");
        List<Occupation> occupations=studentService.getHistory(student.getId());
        model.addAttribute("occupations",occupations);
        return  "history";
    }

}



