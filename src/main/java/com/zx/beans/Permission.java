package com.zx.beans;

public class Permission {
    public int id;
    public String permname;
    public String permurl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermname() {
        return permname;
    }

    public void setPermname(String permname) {
        this.permname = permname;
    }

    public String getPermurl() {
        return permurl;
    }

    public void setPermurl(String permurl) {
        this.permurl = permurl;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permname='" + permname + '\'' +
                ", permurl='" + permurl + '\'' +
                '}';
    }
}
