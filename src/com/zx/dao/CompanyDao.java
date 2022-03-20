package com.zx.dao;

import com.zx.beans.Company;

import java.util.ArrayList;

public interface CompanyDao {
    Company login(String usercode, String password);

    void Register(String cpyaccount, String cpypassword,String cpyname, String cpyphone, String cpyaddress, String cpyinfo);

    void addOccupation(int companyid, int occupationid);













    ArrayList<Company>   getCompanysAdmin();

    boolean cpyaccountIsSame(String cpyaccount);


    Company getCompanyById(int companyid);    //Company的
    void updateCompanyById(Company company);  //Company的
}
