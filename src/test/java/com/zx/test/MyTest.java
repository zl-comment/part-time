package com.zx.test;


import com.zx.controller.AdminController;
import com.zx.controller.StudentController;
import com.zx.service.CompanyService;
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
        StudentServiceImpl studentService=beanFactory.getBean(StudentServiceImpl.class);

       int i= studentService.IsSame("student");
        System.out.println(i);

        System.out.println("test");
    }

}
