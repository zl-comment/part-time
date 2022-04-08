package com.zx.beans;

public class Temporary {
    private int id;                   //id编号
    private String   ocname;           //职位名称
    private String   salary;      //最低工资
    private String requirement;   //招聘要求
    private String workplace;    //工作地点
    private String worktime;    //工作时间
    private String cpyname;
    private int  state;      //企业发布职业的状态

    public Temporary() {
    }

    public Temporary(int id, String ocname, String salary, String requirement, String workplace, String worktime, String cpyname, int state) {
        this.id = id;
        this.ocname = ocname;
        this.salary = salary;
        this.requirement = requirement;
        this.workplace = workplace;
        this.worktime = worktime;
        this.cpyname = cpyname;
        this.state = state;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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

    public String getCpyname() {
        return cpyname;
    }

    public void setCpyname(String cpyname) {
        this.cpyname = cpyname;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Temporary{" +
                "id=" + id +
                ", ocname='" + ocname + '\'' +
                ", salary='" + salary + '\'' +
                ", requirement='" + requirement + '\'' +
                ", workplace='" + workplace + '\'' +
                ", worktime='" + worktime + '\'' +
                ", cpyname='" + cpyname + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
