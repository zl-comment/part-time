package com.zx.beans;

import java.util.List;

public class Company {
    private int id;                   //id编号
    private String cpyname;          //公司名称
    private String cpyaccount;      //公司账号
    private String cpypassword;    //公司账号密码
    private String cpyphone;      //公司电话
    private String cpyaddress;   //公司地址
    private String cpyinfo;     //公司简介
    private int    state;      //公司在平台的状态
    List<Role> roleList;


    private List<Occupation>  occupations;   //公司发布的职位集合

    public Company() {
    }

    public Company(int id, String cpyname, String cpyaccount, String cpypassword, String cpyphone, String cpyaddress, String cpyinfo) {
        this.id = id;
        this.cpyname = cpyname;
        this.cpyaccount = cpyaccount;
        this.cpypassword = cpypassword;
        this.cpyphone = cpyphone;
        this.cpyaddress = cpyaddress;
        this.cpyinfo = cpyinfo;
    }

    public Company(String cpyname, String cpyaccount, String cpypassword, String cpyphone, String cpyaddress, String cpyinfo) {
        this.cpyname = cpyname;
        this.cpyaccount = cpyaccount;
        this.cpypassword = cpypassword;
        this.cpyphone = cpyphone;
        this.cpyaddress = cpyaddress;
        this.cpyinfo = cpyinfo;
    }

    public Company(int id, String cpyname, String cpyaccount, String cpypassword, String cpyphone, String cpyaddress, String cpyinfo, List<Occupation> occupations) {
        this.id = id;
        this.cpyname = cpyname;
        this.cpyaccount = cpyaccount;
        this.cpypassword = cpypassword;
        this.cpyphone = cpyphone;
        this.cpyaddress = cpyaddress;
        this.cpyinfo = cpyinfo;
        this.occupations = occupations;
    }

    public Company(String cpyname, String cpyaccount, String cpypassword, String cpyphone, String cpyaddress, String cpyinfo, List<Occupation> occupations) {
        this.cpyname = cpyname;
        this.cpyaccount = cpyaccount;
        this.cpypassword = cpypassword;
        this.cpyphone = cpyphone;
        this.cpyaddress = cpyaddress;
        this.cpyinfo = cpyinfo;
        this.occupations = occupations;
    }


    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpyname() {
        return cpyname;
    }

    public void setCpyname(String cpyname) {
        this.cpyname = cpyname;
    }

    public String getCpyaccount() {
        return cpyaccount;
    }

    public void setCpyaccount(String cpyaccount) {
        this.cpyaccount = cpyaccount;
    }

    public String getCpypassword() {
        return cpypassword;
    }

    public void setCpypassword(String cpypassword) {
        this.cpypassword = cpypassword;
    }

    public String getCpyphone() {
        return cpyphone;
    }

    public void setCpyphone(String cpyphone) {
        this.cpyphone = cpyphone;
    }

    public String getCpyaddress() {
        return cpyaddress;
    }

    public void setCpyaddress(String cpyaddress) {
        this.cpyaddress = cpyaddress;
    }

    public String getCpyinfo() {
        return cpyinfo;
    }

    public void setCpyinfo(String cpyinfo) {
        this.cpyinfo = cpyinfo;
    }

    public List<Occupation> getOccupations() {
        return occupations;
    }

    public void setOccupations(List<Occupation> occupations) {
        this.occupations = occupations;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", cpyname='" + cpyname + '\'' +
                ", cpyaccount='" + cpyaccount + '\'' +
                ", cpypassword='" + cpypassword + '\'' +
                ", cpyphone='" + cpyphone + '\'' +
                ", cpyaddress='" + cpyaddress + '\'' +
                ", cpyinfo='" + cpyinfo + '\'' +
                ", state=" + state +
                ", roleList=" + roleList +
                ", occupations=" + occupations +
                '}';
    }
}
