package com.zx.dao.impl;


import com.zx.beans.Company;
import com.zx.beans.Occupation;
import com.zx.dao.CompanyDao;
import com.zx.beans.Student;
import com.zx.dao.OccupationDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class OccupationDaoImpl implements OccupationDao {

    @Override //company
    public void Jobpublish(String ocname, String workplace, String worktime, String salary, String requirement) {
        Connection connection=null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "insert into occupation values (null,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);


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
            PreparedStatement ps = connection.prepareStatement(sql);
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
            PreparedStatement ps = connection.prepareStatement(sql);
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
            PreparedStatement ps = connection.prepareStatement(sql);
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
            PreparedStatement ps = connection.prepareStatement(sql);
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
            PreparedStatement ps = connection.prepareStatement(sql);
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
        CompanyDao companyDao=new CompanyDaoImpl();
        Company company=companyDao.getCompanyById(companyid);
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT oc.id ocid ,ocname,salary,requirement,workplace,worktime  from company cpy,occupation oc,cpyandoc cao where cpy.id=cao.companyid and oc.id=cao.occupationid and cpy.id=?";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1,companyid);
            company.setId(companyid);
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
            PreparedStatement ps = connection.prepareStatement(sql);

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
            String sql = "SELECT s.id sid,staccount, stpassword,stphone,stschool,stmajor,stsystem,stdate,o.id oid,ocname,salary,workplace,worktime,a.id stuandocid from student s,stuandoc  a,occupation o where s.id=a.studentid and o.id=a.occupationid and s.id=?";
            //获取数据库操作对象
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,studentid);
            //执行
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("oid");
                String ocname = resultSet.getString("ocname");
                String salary = resultSet.getString("salary");
                String workplace = resultSet.getString("workplace");
                String worktime = resultSet.getString("worktime");
                int stuandocid=resultSet.getInt("stuandocid");

                Occupation occupation = new Occupation(id,ocname,salary,workplace);
                occupation.setWorktime(worktime);
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
    public int getOccupationCountAdmin() {
        Connection connection=null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "SELECT COUNT(o.id) num from occupation o LEFT JOIN cpyandoc cao on o.id=cao.occupationid  LEFT JOIN company co on cao.companyid=co.id where cao.id !=0";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            resultSet.next();
                return resultSet.getInt("num");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
        return 0;
    }

    @Override
    public int selectOccupationCountAdmin(String ocname1, String workplace1) {
            Connection connection=null;

        try {
            connection=JDBCUtil.getConnection();
            StringBuffer sql = new StringBuffer("SELECT  COUNT(o.id) num from occupation o LEFT JOIN cpyandoc cao on o.id=cao.occupationid  LEFT JOIN company co on cao.companyid=co.id where cao.id !=0  ");
            if (!"".equals(ocname1)) {
                sql.append(" and ocname  like '%" + ocname1 + "%' ");
            }
            if (!"".equals(workplace1)) {
                sql.append(" and workplace  like '%" + workplace1+ "%' ");
            }
            PreparedStatement ps=connection.prepareStatement(sql.toString());

            ResultSet resultSet=ps.executeQuery();
            resultSet.next();
            int num=resultSet.getInt("num");

            return num;

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return 0;
    }

    @Override
    public void updateOccupationAudit(int id, int state) {
        Connection connection = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update  cpyandoc  set state=? where occupationid=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,state);
            ps.setInt(2,id);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection);
        }
    }
}
