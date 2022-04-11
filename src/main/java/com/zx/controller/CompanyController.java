package com.zx.controller;

import com.zx.beans.Company;
import com.zx.service.CompanyService;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class CompanyController {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
    @Resource
    private CompanyService companyService;

    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    @RequestMapping("login")
    public String login(){

        companyService.login();
        return "index";

    }


    /*
    如果页面没有传参进来，则会报错null值无法赋值给基本类型
    如果页面传进来的不是int类型，则方法访问不到

    如果想要解决上边的报错，则要将基本类型转换为对应的包装类型 int-> Integer
    * */
    @RequestMapping("test")
    public String test(int i){
        System.out.println(  companyService.companyGetAdmissionById(i));
        return "index";
    }

    /*
    * 如果页面没有传参进来，则可以访问方法只不过得到的name为空，且页面传参的参数名要与其一致
    * */
    @RequestMapping("test2")
    public String test2(String name){
        System.out.println( name);
        return "index";
    }

    /*
    * 可以只传一个参数，该参数仅为int i
    * */
    @RequestMapping("test3")
    public String test3(String name,int i){
        System.out.println( name);
        System.out.println( i);
        return "index";
    }
    /*
    * 当参数前写了@RequestParam，则参数必须要填写，否则报错
    * required 是否默认必填
    * defaultValue 默认参数值（如果用户没有传参，那么该参数具备默认值
    * value 参数名  (如果不写，则默认为方法名)
    *
    *
    * */
    @RequestMapping("test4")
    public String test4(@RequestParam(required = true,value = "aaa",defaultValue = "哈哈哈")  String name){
        System.out.println( name);
        return "index";
    }
    /*
    * 按Servlet的方式获取参数
    * */
    @RequestMapping("test5")
    public String test5(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println( name);
        return "index";
    }

    /*
    * RESTful风格的URL  /company/getAdmissionById/{id}
    * {id} 为占位符 可以接收任意类型的参数(与PathVariable名称要一致)
    * @PathVariable 为获取占位符的值 可以接收任意类型的参数
    * */
    @RequestMapping("test6/{name}")
    public String test6(@PathVariable("name") String name){
        System.out.println( name);
        return "index";
    }

    /*
    * 获得的数据可以赋给数组，但不能赋给集合
    * */
    @RequestMapping("Register")
    public String Register(Company company){

        return "login";
    }

    /*
    * 获得请求头信息
    * */
    @RequestMapping("test7")
    public String test7(@RequestHeader("host") String head){
        System.out.println( head);
        return "index";
    }



    /*
    * 接受日期格式问题:
    * 方式一:SpringMVC后台默认识别斜杠表示日期的数据yyyy/MM/dd
    * 方式二:在后台控制器中先接受String类型，之后转换为Data类型
    * 方式三:使用初始化绑定在每次初始化时改变Date的格式
    *
    * */
    @RequestMapping("test9")
    public String test9(Date stdate){
        System.out.println( stdate);
        return "index";
    }

    //初始化绑定方法
    @InitBinder
    public  void initBinder(WebDataBinder binder, HttpServletRequest request){
        System.out.println(request.getParameter("date"));
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("MM-dd-yyyy"),false));
    }







}
