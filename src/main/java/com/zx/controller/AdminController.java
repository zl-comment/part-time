package com.zx.controller;

import com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleCursorExpr;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zx.beans.*;
import com.zx.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller("adminController")
@SessionAttributes("admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("adminlogin")
    public String login(String usercode, String password, HttpServletResponse response, HttpServletRequest request){

       Admin admin= adminService.adminLogin(usercode,password);
        if(admin!=null){
            //1.获取session
            HttpSession session = request.getSession();
            //2.获取sessionid
            String sessionId = session.getId();
            //3.将sessionid作为key，用户信息user作为value，放入session中
            session.setAttribute(sessionId,usercode);
            //4.将sessionId存到cookie中,"JSESSIONID"为自定义的key值
            Cookie cookie = new Cookie("JSESSIONID",sessionId);
            //5.设置cookie的有效路径
            cookie.setPath(request.getContextPath());
            //6.将cookie返回给页面
            response.addCookie(cookie);
            session.setAttribute("user",admin);
            System.out.println(session);
           return "redirect:adminHome.jsp";

        }else{
            System.out.println("登录失败");
            return "adminlogin";
        }

    }
    @RequestMapping("selectPermission")
    public @ResponseBody Object selectPermission(int Roleid){
        System.out.println(Roleid);
        System.out.println(adminService.selectPermission(Roleid));
        return adminService.selectPermission(Roleid );
    }


    @RequestMapping("getCompanyList")
    public @ResponseBody
    Object  getCompanyList(int currectpage, int limit) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Page<Company> page = adminService.getCompanyList(currectpage, limit);
      String json=  mapper.writeValueAsString(page);
        System.out.println(json);
        return adminService.getCompanyList(currectpage,limit);
    }
    @RequestMapping("adminAuditCompany")
    public void adminAuditCompany(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String companies=request.getParameter("companies");
        String state=request.getParameter("state");
        //将json字符串转为list数组
        ObjectMapper objectMapper=new ObjectMapper();
        List<Company> companies1=objectMapper.readValue(companies, new TypeReference<List<Company>>(){});
        System.out.println(companies1);
        adminService.updateCompanyState(companies1,Integer.parseInt(state));

    }
    @RequestMapping("getCompanyByCpyNameAndCpyAddress")
    public @ResponseBody Object getCompanyByCpyNameAndCpyAddress(String cpyName, String cpyAddress, int currectpage, int limit) throws JsonProcessingException {

        System.out.println(cpyName);
        System.out.println(cpyAddress);
        Page<Company> page = adminService.getCompanyByCpyNameAndCpyAddress(cpyName, cpyAddress, currectpage, limit);

        return page;
    }
    @RequestMapping("getOccupationByPage")
    public @ResponseBody Object getOccupationByPage(int currectpage, int limit) throws JsonProcessingException {

        Page<Temporary> page = adminService.getOccupationByPage(currectpage, limit);

        return page;
    }
    @RequestMapping("adminAuditOccupation")
    public void adminAuditOccupation(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String occupations=request.getParameter("occupations");
        String state=request.getParameter("state");
        //将json字符串转为list数组
        ObjectMapper objectMapper=new ObjectMapper();
        List<Temporary> occupations1=objectMapper.readValue(occupations, new TypeReference<List<Temporary>>(){});
        adminService.updateOccupationState(occupations1,Integer.parseInt(state));

    }
    @RequestMapping("getOccupationByOcNameByPage")
    public @ResponseBody Object  getOccupationByOcNameByPage(String ocName ,String workPlace,String cpyName,String requirement,int currectpage, int limit) throws JsonProcessingException {
        Page<Temporary> page = adminService.getOccupationByOcName(ocName,workPlace,cpyName,requirement,currectpage, limit);
        return page;
    }

    @RequestMapping("getCompanyByIdAndOccupation")
    public String getCompanyByIdAndOccupation(String companyId, Model model){
        Company company=adminService.getCompanyByIdAndOccupation(Integer.parseInt(companyId));
        model.addAttribute("company",company);
        return "adminCompanysp";

    }
    @RequestMapping("getStudentByPage")
    public @ResponseBody Object getStudentByPage(int currectpage, int limit) throws JsonProcessingException {

        Page<Student> page = adminService.getStudent(currectpage, limit);

        return page;
    }
    @RequestMapping("toGoAdminStudentSp")
    public String toGoAdminStudentSp(String studentId, Model model){
        System.out.println(studentId);
        model.addAttribute("studentid",studentId);
        return "adminStudentsp";
    }
    @RequestMapping("getStudentByIdAndOccupation")
    public @ResponseBody Object getStudentByIdAndOccupation(String studentId){
        List<Occupation> occupations=adminService.getStudentByIdAndOccupation(Integer.parseInt(studentId));
        System.out.println(occupations);
        return occupations;
    }
    @RequestMapping("getStudentByIdAdmin")
    public @ResponseBody Object getStudentByIdAdmin(String studentId){
        Student student=adminService.getStudentByIdAdmin(Integer.parseInt(studentId));
        System.out.println(student);
        return student;
    }

    @RequestMapping("AdminGetResumeByResumeId")
    public  String AdminGetResumeByResumeId(String resumeId,Model model){
        Resume resume=adminService.getResumeByResumeId(Integer.parseInt(resumeId));
        System.out.println(resume);
        model.addAttribute("resume",resume);
        return "adminStudentResume";
    }




}
