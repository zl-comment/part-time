package com.zx.controller;



import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Resume;
import com.zx.beans.Student;
import com.zx.service.CompanyService;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


@Controller("companyController")
@SessionAttributes("name")
public class CompanyController {

    @Resource
    private CompanyService companyService;

    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }


    @RequestMapping("Register")
   public String Register(String cpyaccount,String cpypassword,String cpyname,String cpyphone,String cpyaddress,String cpyinfo){
        companyService.companyRegister(cpyaccount,cpypassword,cpyname,cpyphone,cpyaddress,cpyinfo);
        return "login";
    }

    @RequestMapping("Jobpublish")
    public String Jobpublish(String ocname,String workplace,String worktime,String salary,String requirement){
        companyService.jobPublish(ocname,workplace,worktime,salary,requirement);
        return "redirect:Jobpublish.jsp";
    }

    @RequestMapping("getOccupationsCompany")
    public String getOccupationsCompany(HttpServletRequest request, Model model){
        System.out.println(request.getSession().getAttribute("user"));  //对了
        Company company = (Company)request.getSession().getAttribute("user");
        Company occupationsCompany = companyService.getOccupationsCompany(company.getId());

        model.addAttribute("occupations",occupationsCompany.getOccupations());
        model.addAttribute("companyid",company.getId());
        /*model.addAttribute("occupations",companyService.getOccupationsCompany(request.getSession().getAttribute("user")).getOccupations());
        model.addAttribute("companyid",companyService.getOccupationsCompany(((Company) request.getSession().getAttribute("user")).getId()));*/
        return "Jobmanage";
    }//然后写最后两个菜单 知道了我先写吧，   等等一下
    @RequestMapping("jobQuery")
    public String jobQuery(HttpServletRequest request, Model model){
        System.out.println(request.getParameter("ocid"));
        int ocid = Integer.parseInt(request.getParameter("ocid"));
        int companyid = Integer.parseInt(request.getParameter("companyid"));
        model.addAttribute("occupation",companyService.jobQuery(ocid));
        model.addAttribute("companyid",companyid);

        System.out.println(companyService.jobQuery(ocid));
        System.out.println(ocid);
        return "Jobquery";
    }
    @RequestMapping("updateOccupationById")
    public String updateOccupationById(String ocid,String ocname,String salary,String requirement,String workplace,String worktime, Model model){
               // Object object=request.getSession().getAttribute("user");   //以后菜单的url就不要传公司相关的参数了，直接session可以获得
      //  request.getParameter("oc")//你得不到，你的页面的ocid只给了返回的时候的那个
        Occupation occupation = new Occupation(Integer.parseInt(ocid),ocname,salary,requirement,workplace,worktime);
        System.out.println(occupation);//没有ocid这不是公司id么  ocid你页面有吗有我看看
        companyService.updateOccupationById(occupation);
        model.addAttribute("occupation",companyService.jobQuery(Integer.parseInt(ocid)));
        System.out.println(companyService.jobQuery(Integer.parseInt(ocid)));

        return "Jobquery";
    }
    @RequestMapping("deleteOccupationById")
    public String deleteOccupationById(String ocid,String cpyandocid,HttpServletRequest request,Model model){
        companyService.deleteOccupationById(Integer.parseInt(ocid),Integer.parseInt(cpyandocid));
        Company company = (Company)request.getSession().getAttribute("user");
        Company occupationsCompany = companyService.getOccupationsCompany(company.getId());

        model.addAttribute("occupations",occupationsCompany.getOccupations());
        model.addAttribute("companyid",company.getId());
        return "Jobmanage";
    }
    @RequestMapping("getAdmissionById")
    public String getAdmissionById(HttpServletRequest request,Model Model){
        Company company = (Company)request.getSession().getAttribute("user");//这里有company所有值
        System.out.println(company.getId());
        ArrayList<Student> students = companyService.getAdmissionById(company.getId());
        Model.addAttribute("students",students);
        return "Admission";
    }
    @RequestMapping("getStudentResume")
    public String getStudentResume(HttpServletRequest request,Model model){
        int resumeid = Integer.parseInt(request.getParameter("resumeid"));
        Resume resume = companyService.getStudentResume(resumeid);
        model.addAttribute("resume",resume);

        return "studentResume";//一个也没找见啊  反正 你给我把东西挪过来 我才会写估计 真好 咋提交 ....
    }
    @RequestMapping("getCompanyById")
    public String getCompanyById(HttpServletRequest request,Model model){
        Company company = (Company)request.getSession().getAttribute("user");//这里有company所有值
        companyService.getCompanyById(company.getId());
        model.addAttribute("company",company);
        return "Companyquery";
    }

    @RequestMapping("updateCompanyById")
    public String updateCompanyById(String companyid,String cpyaccount,String cpypassword,String cpyname,String cpyphone,String cpyaddress,String cpyinfo,Model model){
        Company company = new Company(Integer.parseInt(companyid),cpyname,cpyaccount,cpypassword,cpyphone,cpyaddress,cpyinfo);
        companyService.updateCompanyById(company);
        System.out.println(company);
        System.out.println(11111);
        model.addAttribute("company",company);
        return "Companyquery";

    }



    //初始化绑定方法
    @InitBinder
    public  void initBinder(WebDataBinder binder, HttpServletRequest request){
        System.out.println(request.getParameter("date"));
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("MM-dd-yyyy"),false));
    }


    @ExceptionHandler(value={Exception.class})
    public String handlerException(Exception e){
        System.out.println("出现异常错误");
        e.printStackTrace();
        return "404";
    }





}
