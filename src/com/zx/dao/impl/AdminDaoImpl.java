package com.zx.dao.impl;

import com.zx.beans.Admin;
import com.zx.dao.AdminDao;
import com.zx.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDaoImpl  implements AdminDao {

    @Override
    public Admin login(String usercode, String password) {
        Connection connection=null;

        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT *from admin  where adminname=? and adminpassword=?";
            PreparedStatement   ps = connection.prepareStatement(sql);

            ps.setString(1,usercode);
            ps.setString(2,password);

            ResultSet resultSet= ps.executeQuery();
            resultSet.next();
                int id=resultSet.getInt("id");
                String adminphone=resultSet.getString("adminphone");
                int state=resultSet.getInt("state");

                Admin admin=new Admin(id,usercode,password,adminphone,state);
                return admin;



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return null;
    }

 /*   @Override
    public boolean usernameIsSame(String username) {
        Connection connection=null;
        try {
            connection= JDBCUtil.getConnection();
            String sql="SELECT id   from  admin  where adminname=?";
            PreparedStatement   ps = connection.prepareStatement(sql);
            ps.setString(1,username);
            ResultSet resultSet= ps.executeQuery();
            while (resultSet.next()){
               return true;    //存在
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return false;     //不存在
    }
    */

}
