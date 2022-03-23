package com.zx.dao.impl;

import com.zx.beans.Company;
import com.zx.beans.Page;
import com.zx.beans.Student;
import com.zx.dao.CompanyDao;
import com.zx.dao.PageDao;
import com.zx.dao.StudentDao;
import com.zx.util.JDBCUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PageDaoImpl implements PageDao {

    @Override
    public Page<Company> getCompanyByPageAdmin(int pagenum, int pagesize) {
        Page<Company> page=new Page<>();
        Connection connection=null;
        ArrayList<Company> companies=new ArrayList<>();
        try {

            connection= JDBCUtil.getConnection();
            String sql="select  *from company  LIMIT ?,?";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,(pagenum-1)*pagesize);
            ps.setInt(2,pagesize);
            ResultSet resultSet=ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String cpyname = resultSet.getString("cpyname");
                String cpyaccount = resultSet.getString("cpyaccount");
                String cpypassword = resultSet.getString("cpypassword");

                String cpyphone = resultSet.getString("cpyphone");
                String cpyaddress = resultSet.getString("cpyaddress");
                String cpyinfo = resultSet.getString("cpyinfo");

                Company company = new Company(id, cpyname, cpyaccount, cpypassword, cpyphone, cpyaddress, cpyinfo);
                companies.add(company);


            }
            page.setDatas(companies);
            page.setCurrentPage(pagenum);
            page.setPageSize(pagesize);
            CompanyDao companyDao=new CompanyDaoImpl();
          int dataCount=companyDao.getCompanyCountAdmin();
            page.setDataCount(dataCount);
            page.setPageCount(dataCount % pagesize == 0 ? (dataCount / pagesize) : ((dataCount / pagesize) + 1));


            return page;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return null;
    }


    @Override
    public Page<Student> getStudentByPageAdmin(int pagenum, int pagesize) {

        Page<Student> page=new Page<>();
        Connection connection=null;
        ArrayList<Student> students=new ArrayList<>();
        try {

            connection= JDBCUtil.getConnection();
            String sql="select  *from student  LIMIT ?,?";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,(pagenum-1)*pagesize);
            ps.setInt(2,pagesize);
            ResultSet resultSet=ps.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String stname=resultSet.getString("stname");
                String usercode=resultSet.getString("staccount");
                //   String password=resultSet.getString("stpassword");
                String stphone=resultSet.getString("stphone");
                String stschool=resultSet.getString("stschool");
                String stmajor=resultSet.getString("stmajor");
                int stsystem=resultSet.getInt("stsystem");
                //  Date stdate=resultSet.getDate("stdate");
                //  String stresume=resultSet.getString("stresume");
                //  int ststate=resultSet.getInt("ststate");

                Student student=new Student(id,stname,usercode,stphone,stschool,stmajor,stsystem);

                students.add(student);


            }
            page.setDatas(students);
            page.setCurrentPage(pagenum);
            page.setPageSize(pagesize);
            StudentDao studentDao=new StudentDaoImpl();
            int dataCount=studentDao.getStudentCountAdmin();
            page.setDataCount(dataCount);
            page.setPageCount(dataCount % pagesize == 0 ? (dataCount / pagesize) : ((dataCount / pagesize) + 1));


            return page;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return null;




    }
}
