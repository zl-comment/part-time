package com.zx.dao;

import com.zx.beans.Company;

public interface CompanyDao {
    Company login(String usercode, String password);

    void Register(String cpyaccount, String cpypassword,String cpyname, String cpyphone, String cpyaddress, String cpyinfo);

    void addOccupation(int companyid, int occupationid);


    Company getCompanyById(int companyid);
    void updateCompanyById(Company company);
}
