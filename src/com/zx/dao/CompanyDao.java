package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;

import java.util.ArrayList;

public interface CompanyDao {
    String login(String usercode, String password);

    Company loginHome(String usercode);

    void Register(String cpyaccount, String cpypassword,String cpyname, String cpyphone, String cpyaddress, String cpyinfo);

    void addOccupation(int companyid, int occupationid);




/*
    ArrayList<Company>   getCompanysAdmin();*/

    boolean cpyaccountIsSame(String cpyaccount);


    Company getCompanyById(int companyid);    //Company的
    void updateCompanyById(Company company);  //Company的

    ArrayList<Occupation> getAdmissionById(int parseInt);
    public int getCompanyCountAdmin();

    void updateCompanyPass(int id, int state);

    void updateCompanyReject(int id, int state);

    int selectCompanyCountAdmin(String cpyname,String cpyaddress);
}
