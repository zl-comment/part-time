package com.zx.beans;

import java.util.Date;
import java.util.List;

public class Student {
    private int id;
    private String stname;       //学生名字
    private String staccount;      //账户
    private String stpassword;       //密码
    private String stphone;          //手机号
    private String stschool;        //学校
    private String stmajor;        //学科
    private int    stsystem;      //学生的学制
    private Date   stdate;       //学生的入学日期
    private String stresume;    //学生的简历
    private int    ststate;    //学生录取状态

    private List<Occupation> occupations;//学生所报职位集合




}
