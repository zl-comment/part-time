package com.zx.dao;


import org.apache.ibatis.annotations.Param;



public interface AdminDao   {

    int login(@Param("usercode") String usercode,@Param("password") String password);





    void out(int q);
    void in(int q);
    int qian1();
    int qian2();

}
