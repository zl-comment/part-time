/*
package com.zx.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

*/
/*
第一步：导入切面的maven坐标
      创建类，标明@Aspect 成为切面
      指定方法，在方法上边标签切入的时机
      在@Before方法中写切入点表达式
      配置切面
* *//*

*/
/*@Component
@Aspect*//*

public class MyAspect {

    public void test01(){
        System.out.println("开启事务");
    }

    public void test02(){
        System.out.println("关闭事务");
    }

  public void test03(){
        System.out.println("最终通知");
}


    public void test04(){
        System.out.println("抛异常通知");
    }


}
*/



package com.zx.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component //控制反转
@Aspect  //切面
public class MyAspect {



    /*
     * 切入点表达式一般切入的是某一类方法
     * 语法:
     *  execution(访问修饰符 返回值 全限定类名.方法名(参数))
     * 方法名：test01: 直接写方法名，则代表了一个方法
     *       test*:匹配test开头的方法
     *       *test:匹配以test结尾的方法
     *        *:切入任意方法
     *    com.zx.controller.*.*  :切入controller下的任意类下的任意方法名--返回值为空
     *    com.zx.service.*.*:切入service接口下的所有接口下的任意方法
     *    com.zx.service..*.*:切入service接口下的所有接口以及子包下接口实习类的任意方法
     *    参数：
     *        ()  空参
     *        (int) (String)  有且仅有一个int/String类型的参数
     *        (*)
     *        (int,int) 有且只有两个int参数
     *        (*,*)有且仅有两个任意类型的参数
     *        (..) 任意类型任意个数的参数
     *    返回值：
     *    *  任意类型
     *    int int类型
     *    String String类型
     *
     *
     *
     *
     *
     * 切面应该切业务层而不是控制器层
     * */


    /*前置通知*/
    /*service必须交给Controller，事务才起作用*/
    @Before("execution(public void com.zx.controller.*.*(..))")
    public void test(){
        System.out.println("开启事务");
    }

    //冒泡排序




    /*  *//*后置通知*//*
   // @AfterReturning("execution(public void com.zx.service.impl.CompanyServiceImpl.login())")
    public void tes2(){
        System.out.println("关闭事务");
    }

    *//*最终通知*//*
    @After("execution(public void com.zx.service.impl.CompanyServiceImpl.login())")
    public void tes3(){
        System.out.println("最终通知");
    }

    *//*抛异常通知*//*
    @AfterThrowing("execution(public void com.zx.service.impl.CompanyServiceImpl.login())")
    public void tes4(){
        System.out.println("抛异常通知");
    }

    *//*环绕通知*//*
    @Around("execution(public void com.zx.service.impl.CompanyServiceImpl.login())")
    public void tes5(ProceedingJoinPoint p) throws Throwable {

        System.out.println("环绕前通知");
        p.proceed();
        System.out.println("环绕后通知");
    }
*/
}

