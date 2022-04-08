package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Page;
import com.zx.beans.Student;
import com.zx.beans.Temporary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PageDao {
/*
    Page<Company> getCompanyByPageAdmin(@Param("pagenum") int pagenum,@Param("pagesize") int pagesize);
*/
    List<Company> getCompanyByPageAdmin(@Param("pagenum") int pagenum,@Param("pagesize") int pagesize);   //map传参

    Page<Student> getStudentByPageAdmin(int pagenum, int pagesize);

    Page<Company> selectCompanyByCpyNameOrCpyAddressByPage(int pagenum, int pagesize,String cpyname, String cpyaddress);

    Page<Temporary> getOccupationByPageAdmin(int pagenum, int pagesize);

    Page<Temporary> selectOccupationByOcNameOrWorkplaceByPage(int pagenum, int pagesize, String ocname, String workplace);

}
