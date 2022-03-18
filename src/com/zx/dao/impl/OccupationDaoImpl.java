package com.zx.dao.impl;

import com.zx.beans.Admin;
import com.zx.beans.Occupation;
import com.zx.beans.Page;
import com.zx.beans.Student;
import com.zx.dao.OccupationDao;
import com.zx.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OccupationDaoImpl implements OccupationDao {

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
