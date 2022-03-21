package com.zx.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Occupation {
    private int id;                   //id编号
    private String   ocname;           //职位名称
    private String   salary;      //最低工资
    private String requirement;   //招聘要求
    private String workplace;    //工作地点
    private String worktime;    //工作时间

    @JsonIgnore
    private List<Company> companies;   //有该职位的公司集合

    @JsonIgnore
    private List<Student> students;   //公司下职位的学生集合

    @JsonIgnore
    private int cpyandocid;     //是cpyandoc中的id字符

    @JsonIgnore
    private int stuandocid;     //是stuandoc中的id字符

    public Occupation() {

    }
    public Occupation(int id, String ocname, String salary, String requirement, String workplace, String worktime) {
        this.id = id;
        this.ocname = ocname;
        this.salary = salary;
        this.requirement = requirement;
        this.workplace = workplace;
        this.worktime = worktime;
    }

    public Occupation(String ocname, String salary, String requirement, String workplace, String worktime) {
        this.ocname = ocname;
        this.salary = salary;
        this.requirement = requirement;
        this.workplace = workplace;
        this.worktime = worktime;
    }

    public int getCpyandocid() {
        return cpyandocid;
    }

    public void setCpyandocid(int cpyandocid) {
        this.cpyandocid = cpyandocid;
    }

    public int getStuandocid() {
        return stuandocid;
    }

    public void setStuandocid(int stuandocid) {
        this.stuandocid = stuandocid;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOcname() {
        return ocname;
    }

    public void setOcname(String ocname) {
        this.ocname = ocname;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public Occupation(int id, String ocname, String salary, String workplace,String worktime) {
        this.id = id;
        this.ocname = ocname;
        this.salary = salary;
        this.workplace = workplace;
        this.worktime = worktime;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "id=" + id +
                ", ocname='" + ocname + '\'' +
                ", salary=" + salary +
                ", requirement='" + requirement + '\'' +
                ", workplace='" + workplace + '\'' +
                ", worktime='" + worktime + '\'' +
                '}';
    }
}

