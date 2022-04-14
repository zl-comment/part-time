package com.zx.dao;

import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.beans.Student;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface CompanyDao {
    Company login(@Param("usercode") String usercode,@Param("password") String password);

    Company loginHome(String usercode);

    void Register(@Param("cpyaccount") String cpyaccount,@Param("cpypassword") String cpypassword,@Param("cpyname")  String cpyname,@Param("cpyphone") String cpyphone,@Param("cpyaddress") String cpyaddress,@Param("cpyinfo") String cpyinfo);

    void addOccupation(@Param("companyid") int companyid,@Param("occupationid") int occupationid);


    /*
    * 少两个对职业通过的方法后面可以合二为一
    * */

 /*   ArrayList<Company>   getCompanysAdmin();*/  //弃用

    boolean cpyaccountIsSame(String cpyaccount);


    Company getCompanyById(int companyid);    //Company的
    void updateCompanyById(Company company);  //Company的

/*    ArrayList<Occupation> getAdmissionById(int  companyid);*/
    ArrayList<Student> getAdmissionById(int  companyid);


    public int getCompanyCountAdmin();

    void updateCompanyState(@Param("id") int id,@Param("state") int state);   //修改了把拒绝与通过合在一起

    int selectCompanyCountAdmin(String cpyname,String cpyaddress);



}
