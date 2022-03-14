package com.zx.dao;

import com.zx.beans.Company;

public interface CompanyDao {

    void Register(String cpyaccount, String cpypassword,String cpyname, String cpyphone, String cpyaddress, String cpyinfo);
}
