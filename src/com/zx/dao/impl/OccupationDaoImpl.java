package com.zx.dao.impl;

import com.mysql.jdbc.PreparedStatement;
import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.dao.CompanyDao;
import com.zx.beans.Student;
import com.zx.beans.Admin;
import com.zx.beans.Occupation;
import com.zx.beans.Page;
import com.zx.beans.Student;
import com.zx.dao.OccupationDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.zip.ZipOutputStream;
import com.zx.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OccupationDaoImpl implements OccupationDao {

    @Override //company
    public void Jobpublish(String ocname, String workplace, String worktime, String salary, String requirement) {
        Connection connection=null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "insert into occupation values (null,?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);


            ps.setString(1,ocname);
            ps.setString(2,salary);
            ps.setString(3,requirement);
            ps.setString(4,workplace);
            ps.setString(5,worktime);
            ps.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }


    }

    @Override //company
    public Company    getOccupationsCompany(int companyid) {
        Connection connection = null;
        ArrayList<Occupation> occupations = new ArrayList<>();
        Company company=new Company();
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT ocname,salary,workplace,requirement , co.id cpyandocid ,oc.id occupationid from occupation oc,cpyandoc co ,company  cpy where oc.id=co.occupationid and cpy.id=co.companyid and cpy.id=? ";
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.setInt(1,companyid);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
            String ocname= resultSet.getString("ocname");
            String salary= resultSet.getString("salary");
            String workplace= resultSet.getString("workplace");
            String requirement= resultSet.getString("requirement");
            int cpyandocid=resultSet.getInt("cpyandocid");  //#
            int occupationid=resultSet.getInt("occupationid");


            Occupation occupation=new Occupation(occupationid,ocname,salary,workplace,requirement);
            occupation.setCpyandocid(cpyandocid);
            occupations.add(occupation);

            }
            company.setOccupations(occupations);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }

        return company;
    }
    @Override //company
    public Occupation getOccupationById(int ocid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select * from occupation where id = ?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            ps.setInt(1,ocid);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            String ocname= resultSet.getString("ocname");
            String salary= resultSet.getString("salary");
            String requirement = resultSet.getString("requirement");
            String workplace= resultSet.getString("workplace");
            String worktime= resultSet.getString("worktime");
            Occupation occupation = new Occupation(ocid,ocname,salary,requirement,workplace,worktime);
            return occupation;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return  null;
    }

    @Override
    public void deleteOccupationById(int ocid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "delete from occupation where id=?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            System.out.println(ocid);
            ps.setInt(1,ocid);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

    }

    @Override
    public void updateOccupationById(Occupation occupation) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update occupation set ocname = ?,salary = ?,requirement = ?,workplace = ?,worktime = ?where id=?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            ps.setString(1,occupation.getOcname());
            ps.setString(2,occupation.getSalary());
            ps.setString(3,occupation.getRequirement());
            ps.setString(4,occupation.getWorkplace());
            ps.setString(5,occupation.getWorktime());
            ps.setInt(6,occupation.getId());


            ps.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
    }

    @Override
    public int jobIdBy(String ocname, String workplace, String worktime, String salary, String requirement) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT id from occupation  where ocname=? and workplace=? and worktime=? and salary=? and requirement=?";
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
            ps.setString(1,ocname);
            ps.setString(2,workplace);
            ps.setString(3,worktime);
            ps.setString(4,salary);
            ps.setString(5,requirement);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
            int id = resultSet.getInt("id");
            return id;





        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return 0;
    }


    @Override
    public void deleteCpyandocById(int cpyandocid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "delete from cpyandoc where id=?";
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement(sql);
            ps.setInt(1,cpyandocid);
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
    }

    @Override
    public Company occupationByCompanyAdmin(int companyid) {         //admin
        Connection connection=null;
        ArrayList<Occupation> occupations=new ArrayList<Occupation>();
        Company company=new Company();
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT  cpy.id cpyid , cpyname,cpyaccount,cpypassword,cpyphone,cpyaddress,cpyinfo ,oc.id ocid ,ocname,salary,requirement,workplace,worktime  from company cpy,occupation oc,cpyandoc cao where cpy.id=cao.companyid and oc.id=cao.occupationid and cpy.id=?";
            java.sql.PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1,companyid);

            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
                int cpyid=resultSet.getInt("cpyid");
                    company.setId(cpyid);
                String  cpyname=resultSet.getString("cpyname");
                   company.setCpyname(cpyname);
                String  cpyaccount=resultSet.getString("cpyaccount");
                  company.setCpyaccount(cpyaccount);
                String  cpypassword=resultSet.getString("cpypassword");
                 company.setCpypassword(cpypassword);
                String  cpyphone=resultSet.getString("cpyphone");
                 company.setCpyphone(cpyphone);
                String  cpyaddress=resultSet.getString("cpyaddress");
                company.setCpyaddress(cpyaddress);
                String  cpyinfo=resultSet.getString("cpyinfo");
               company.setCpyinfo(cpyinfo);

                int ocid=resultSet.getInt("ocid");

                String ocname=resultSet.getString("ocname");
                String salary=resultSet.getString("salary");
                String requirement=resultSet.getString("requirement");
                String workplace=resultSet.getString("workplace");
                String worktime=resultSet.getString("worktime");


                Occupation occupation=new Occupation(ocid,ocname,salary,requirement,workplace,worktime);

                occupations.add(occupation);
            }

            company.setOccupations(occupations);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

        return company;
    }


    @Override
    public Student occupationByStudentAdmin(int studentid) {
        Connection connection=null;
        ArrayList<Occupation> occupations=new ArrayList<Occupation>();
        Student student=new Student();
        System.out.println(studentid);
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT oc.id ocid ,ocname,salary,requirement,workplace,worktime  from student stu,occupation oc,stuandoc sta where stu.id=sta.studentid and oc.id=sta.occupationid and stu.id=?";
            java.sql.PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1,studentid);
            ResultSet resultSet= ps.executeQuery();

            while (resultSet.next()){


                int ocid=resultSet.getInt("ocid");

                String ocname=resultSet.getString("ocname");
                String salary=resultSet.getString("salary");
                String requirement=resultSet.getString("requirement");
                String workplace=resultSet.getString("workplace");
                String worktime=resultSet.getString("worktime");


                Occupation occupation=new Occupation(ocid,ocname,salary,requirement,workplace,worktime);

                occupations.add(occupation);
            }

            student.setOccupations(occupations);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }

        return student;
    }


    @Override
    public Student getOccupationsStudent(int studentid) {
        ArrayList<Occupation> occupations = new ArrayList<Occupation>();
        Student student=new Student();
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT  s.id sid,staccount, stpassword,stphone,stschool,stmajor,stsystem,stdate,o.id oid,ocname,salary,workplace,worktime,a.id stuandocid from student s,stuandoc  a,occupation o where s.id=a.studentid and o.id=a.occcupationid and s.id=?";

            //获取数据库操作对象
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,studentid);
            //执行
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("oid");
                String ocname = resultSet.getString("ocname");
                Double salary = resultSet.getDouble("salary");
                String workplace = resultSet.getString("workplace");
                String worktime = resultSet.getString("worktime");
                int stuandocid=resultSet.getInt("stuandocid");

                Occupation occupation = new Occupation(id,ocname,salary,workplace,worktime);
                occupation.setStuandocid(stuandocid);
                occupations.add(occupation);
            }
            student.setOccupations(occupations);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);

        }
        return student;
    }

    @Override
    public void deleteOccupationsByIdStudent(int stuandocid) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();

            String sql = "delete from stuandoc where id = ?";
            //获取数据库操作对象
            PreparedStatement ps = connection.prepareStatement(sql);
            //如果有？ 替换？
            ps.setInt(1,stuandocid);
            //执行
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Page<Occupation> getOccupationsStudentByPage(int currentPage, int pageSize, int studentid) {
        Connection connection = null;
        List<Occupation> books = new ArrayList<>();
        Page<Occupation> page = new Page<>();
        try {
            connection = JDBCUtil.getConnection();

            String sql = "select * from occupation limit ?,?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,(currentPage-1)*pageSize);
            ps.setInt(2,pageSize);
            ResultSet resultSet = ps.executeQuery();
           /* while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String press = resultSet.getString("press");
                Date createtime = resultSet.getDate("createtime");
                String imageurl = resultSet.getString("imageurl");
                int state = resultSet.getInt("state");
                int count = resultSet.getInt("count");
                String bookinfo = resultSet.getString("bookinfo");
                int tid = resultSet.getInt("tid");
                OccupationDao occupationDao = new OccupationDaoImpl();
                Occupation occupation = OccupationDao.getOccupationsStudentByPage(currentPage,2,studentid);
                Book book = new Book(id,name,price,press,createtime,imageurl,state,count,bookinfo);
                book.setBookType(bookType);
                books.add(book);
            }

            page.setCurrentPage(currentPage);
            page.setPageSize(pageSize);
            int dataCount = getBooksCount();
            page.setDataCount(dataCount);
            int pageCount = dataCount%pageSize == 0?(dataCount/pageSize):((dataCount/pageSize)+1);
            System.out.println(pageCount);
            page.setPageCount(pageCount);
            page.setDatas(books);*/
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return page;
    }




}
