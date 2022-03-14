package com.zx.dao;

import com.zx.beans.Company;

public interface CompanyDao {
    Company login(String usercode, String password);
}
