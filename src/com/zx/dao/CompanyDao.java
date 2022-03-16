package com.zx.dao;

import com.zx.beans.Company;

import java.util.ArrayList;

public interface CompanyDao {
    Company login(String usercode, String password);

    void Register(String cpyaccount, String cpypassword,String cpyname, String cpyphone, String cpyaddress, String cpyinfo);

    ArrayList<Company> getCompanys();
}
