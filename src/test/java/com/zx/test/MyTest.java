package com.zx.test;


import com.zx.controller.AdminController;
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
        AdminController adminController= (AdminController) beanFactory.getBean("adminController");



        System.out.println("test");
    }

}
