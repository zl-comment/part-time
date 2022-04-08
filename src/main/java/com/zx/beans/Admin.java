package com.zx.beans;

import java.util.List;

public class Admin {
    private int id;
    private String adminname;
    private String adminpassword;
    private String adminphone;
    private int state;
    List<Role> roleList;

    public Admin() {
    }

    public Admin(int id, String adminname, String adminpassword, String adminphone, int state) {
        this.id = id;
        this.adminname = adminname;
        this.adminpassword = adminpassword;
        this.adminphone = adminphone;
        this.state = state;
    }

    public Admin(String adminname, String adminpassword, String adminphone, int state) {
        this.adminname = adminname;
        this.adminpassword = adminpassword;
        this.adminphone = adminphone;
        this.state = state;
    }


    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public String getAdminphone() {
        return adminphone;
    }

    public void setAdminphone(String adminphone) {
        this.adminphone = adminphone;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminname='" + adminname + '\'' +
                ", adminpassword='" + adminpassword + '\'' +
                ", adminphone='" + adminphone + '\'' +
                ", state=" + state +
                '}';
    }
}
