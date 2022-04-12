package com.zx.test;


import com.zx.controller.AdminController;
import com.zx.service.StudentService;
import com.zx.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.io.IOException;
import java.text.ParseException;


@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:beans.xml"})
public class MyTest {


    @Test
    public void test() throws IOException, ParseException {
      /*  BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        AdminController adminController= (AdminController) beanFactory.getBean("adminController");
*/
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        StudentServiceImpl studentService =(StudentServiceImpl) beanFactory.getBean("studentServiceImpl");
        studentService.test();

    }

}
