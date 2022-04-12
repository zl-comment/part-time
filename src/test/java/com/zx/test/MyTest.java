package com.zx.test;


import com.zx.controller.AdminController;
import com.zx.controller.StudentController;
import com.zx.service.AdminService;
import com.zx.service.CompanyService;
import com.zx.service.impl.AdminServiceImpl;
import com.zx.service.impl.CompanyServiceImpl;
import com.zx.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.io.IOException;


@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:beans.xml"})
public class MyTest {


    @Test
    public void test() throws IOException {
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        AdminServiceImpl adminService= (AdminServiceImpl) beanFactory.getBean("adminServiceImpl");

       adminService.getCompanyList(1,3);


        System.out.println("test");
    }

}
