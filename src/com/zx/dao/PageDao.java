package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Page;
import com.zx.beans.Student;

public interface PageDao {
    Page<Company> getCompanyByPageAdmin(int pagenum, int pagesize);

    Page<Student> getStudentByPageAdmin(int pagenum, int pagesize);

    Page<Company> selectCompanyByCpyNameOrCpyAddressByPage(int pagenum, int pagesize,String cpyname, String cpyaddress);
}
