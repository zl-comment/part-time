package com.zx.dao;

import com.zx.beans.*;

public interface PageDao {
    Page<Company> getCompanyByPageAdmin(int pagenum, int pagesize);

    Page<Student> getStudentByPageAdmin(int pagenum, int pagesize);

    Page<Company> selectCompanyByCpyNameOrCpyAddressByPage(int pagenum, int pagesize,String cpyname, String cpyaddress);

    Page<Temporary> getOccupationByPageAdmin(int pagenum, int pagesize);

    Page<Temporary> selectOccupationByOcNameOrWorkplaceByPage(int pagenum, int pagesize, String ocname, String workplace);
}
