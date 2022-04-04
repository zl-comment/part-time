package com.zx.dao.impl;

import com.zx.beans.*;
import com.zx.dao.CompanyDao;
import com.zx.dao.OccupationDao;
import com.zx.dao.PageDao;
import com.zx.dao.StudentDao;
import com.zx.util.JDBCUtil;
import jdk.internal.dynalink.linker.LinkerServices;


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
                int    state=resultSet.getInt("state"); //增加了state企业状态

                Company company = new Company(id, cpyname, cpyaccount, cpypassword, cpyphone, cpyaddress, cpyinfo);
                company.setState(state);   //增加了state企业状态
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

    @Override
    public Page<Company> selectCompanyByCpyNameOrCpyAddressByPage(int pagenum, int pagesize,String cpyname1, String cpyaddress1) {
        Page<Company> page=new Page<>();
        Connection connection=null;
        ArrayList<Company> companies=new ArrayList<>();
        try {

            connection= JDBCUtil.getConnection();
            StringBuffer sql = new StringBuffer("SELECT * from company where 1=1");
            if (!"".equals(cpyname1)) {
                sql.append(" and cpyname like '%" + cpyname1 + "%' ");
            }
            if (!"".equals(cpyaddress1)) {
                sql.append(" and cpyaddress  like '%" + cpyaddress1+ "%' ");
            }
            sql.append(" limit ?,?");
            PreparedStatement ps = connection.prepareStatement(sql.toString());
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
                int    state=resultSet.getInt("state"); //增加了state企业状态

                Company company = new Company(id, cpyname, cpyaccount, cpypassword, cpyphone, cpyaddress, cpyinfo);
                company.setState(state);   //增加了state企业状态
                companies.add(company);


            }
            page.setDatas(companies);
            page.setCurrentPage(pagenum);
            page.setPageSize(pagesize);
            CompanyDao companyDao=new CompanyDaoImpl();
            int dataCount=companyDao.selectCompanyCountAdmin(cpyname1,cpyaddress1);
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
    public Page<Temporary> getOccupationByPageAdmin(int pagenum, int pagesize) {
            Connection connection=null;
        ArrayList<Temporary> temporaryList=new ArrayList<>();
        Page<Temporary> page=new Page<>();
        try {
            connection=JDBCUtil.getConnection();
            String sql="SELECT o.id id,o.ocname,o.salary,o.requirement,o.workplace,o.worktime,co.cpyname,cao.state  from occupation o LEFT JOIN cpyandoc cao on o.id=cao.occupationid  LEFT JOIN company co on cao.companyid=co.id where cao.id !=0 LIMIT ?,?";
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,(pagenum-1)*pagesize);
            ps.setInt(2,pagesize);
            ResultSet resultSet=ps.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String ocname=resultSet.getString("ocname");
                String salary=resultSet.getString("salary");
                String requirement=resultSet.getString("requirement");
                String workplace=resultSet.getString("workplace");
                String worktime=resultSet.getString("worktime");
                String cpyname=resultSet.getString("cpyname");
                int state=resultSet.getInt("state");
        Temporary temporary=new Temporary(id,ocname,salary,requirement,workplace,worktime,cpyname,state);
        temporaryList.add(temporary);
            }
            page.setDatas(temporaryList);
            page.setCurrentPage(pagenum);
            page.setPageSize(pagesize);
            OccupationDao occupationDao=new OccupationDaoImpl();
            int dataCount=occupationDao.getOccupationCountAdmin();
            page.setDataCount(dataCount);
            page.setPageCount(dataCount % pagesize == 0 ? (dataCount / pagesize) : ((dataCount / pagesize) + 1));

            return  page;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }


    @Override
    public Page<Temporary> selectOccupationByOcNameOrWorkplaceByPage(int pagenum, int pagesize, String ocname1, String workplace1) {
        Connection connection=null;
        ArrayList<Temporary> temporaryList=new ArrayList<>();
        Page<Temporary> page=new Page<>();
        try {
            connection= JDBCUtil.getConnection();
            StringBuffer sql = new StringBuffer("SELECT o.id id,o.ocname,o.salary,o.requirement,o.workplace,o.worktime,co.cpyname,cao.state  from occupation o LEFT JOIN cpyandoc cao on o.id=cao.occupationid  LEFT JOIN company co on cao.companyid=co.id where cao.id !=0  ");
            if (!"".equals(ocname1)) {
                sql.append(" and ocname  like '%" + ocname1 + "%' ");
            }
            if (!"".equals(workplace1)) {
                sql.append(" and workplace  like '%" + workplace1+ "%' ");
            }
            sql.append(" limit ?,?");
            PreparedStatement ps=connection.prepareStatement(sql.toString());
            ps.setInt(1,(pagenum-1)*pagesize);
            ps.setInt(2,pagesize);
            ResultSet resultSet=ps.executeQuery();

            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String ocname=resultSet.getString("ocname");
                String salary=resultSet.getString("salary");
                String requirement=resultSet.getString("requirement");
                String workplace=resultSet.getString("workplace");
                String worktime=resultSet.getString("worktime");
                String cpyname=resultSet.getString("cpyname");
                int state=resultSet.getInt("state");
                Temporary temporary=new Temporary(id,ocname,salary,requirement,workplace,worktime,cpyname,state);
                temporaryList.add(temporary);
            }
            page.setDatas(temporaryList);
            page.setCurrentPage(pagenum);
            page.setPageSize(pagesize);
            OccupationDao occupationDao=new OccupationDaoImpl();
            int dataCount=occupationDao.selectOccupationCountAdmin(ocname1,workplace1);
            page.setDataCount(dataCount);
            page.setPageCount(dataCount % pagesize == 0 ? (dataCount / pagesize) : ((dataCount / pagesize) + 1));



            return  page;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
