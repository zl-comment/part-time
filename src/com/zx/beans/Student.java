package com.zx.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
    private List<Occupation> occupations;//学生所报职位集合



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public String getStaccount() {
        return staccount;
    }


    public void setStaccount(String staccount) {
        this.staccount = staccount;
    }

    public String getStpassword() {
        return stpassword;
    }

    public void setStpassword(String stpassword) {
        this.stpassword = stpassword;
    }

    public String getStphone() {
        return stphone;
    }

    public void setStphone(String stphone) {
        this.stphone = stphone;
    }

    public String getStschool() {
        return stschool;
    }

    public void setStschool(String stschool) {
        this.stschool = stschool;
    }

    public String getStmajor() {
        return stmajor;
    }

    public void setStmajor(String stmajor) {
        this.stmajor = stmajor;
    }

    public int getStsystem() {
        return stsystem;
    }

    public void setStsystem(int stsystem) {
        this.stsystem = stsystem;
    }

    public Date getStdate() {
        return stdate;
    }

    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    public String getStresume() {
        return stresume;
    }

    public void setStresume(String stresume) {
        this.stresume = stresume;
    }

    public int getStstate() {
        return ststate;
    }

    public void setStstate(int ststate) {
        this.ststate = ststate;
    }

    public List<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(List<Occupation> occupations) {
        this.occupations = occupations;
    }

    public Student(int id, String stname, String staccount, String stpassword, String stphone, String stschool, String stmajor, int stsystem, Date stdate, String stresume, int ststate) {
        this.id = id;
        this.stname = stname;
        this.staccount = staccount;
        this.stpassword = stpassword;
        this.stphone = stphone;
        this.stschool = stschool;
        this.stmajor = stmajor;
        this.stsystem = stsystem;
        this.stdate = stdate;
        this.stresume = stresume;
        this.ststate = ststate;
    }

    public Student(String stname, String staccount, String stpassword, String stphone, String stschool, String stmajor, int stsystem, Date stdate, String stresume, int ststate) {
        this.stname = stname;
        this.staccount = staccount;
        this.stpassword = stpassword;
        this.stphone = stphone;
        this.stschool = stschool;
        this.stmajor = stmajor;
        this.stsystem = stsystem;
        this.stdate = stdate;
        this.stresume = stresume;
        this.ststate = ststate;
    }

    public Student(int id, String stname, String staccount, String stphone, String stschool, String stmajor, int stsystem) {
        this.id = id;
        this.stname = stname;
        this.staccount = staccount;
        this.stphone = stphone;
        this.stschool = stschool;
        this.stmajor = stmajor;
        this.stsystem = stsystem;
    }

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stname='" + stname + '\'' +
                ", staccount='" + staccount + '\'' +
                ", stpassword='" + stpassword + '\'' +
                ", stphone='" + stphone + '\'' +
                ", stschool='" + stschool + '\'' +
                ", stmajor='" + stmajor + '\'' +
                ", stsystem=" + stsystem +
                ", stdate=" + stdate +
                ", stresume='" + stresume + '\'' +
                ", ststate=" + ststate +
                '}';
    }
}
