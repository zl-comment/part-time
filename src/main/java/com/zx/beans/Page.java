package com.zx.beans;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class Page <T>{
    private final int code=0;
    private final String msg="";
    private int count;
    private PageInfo<T> data;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public PageInfo<T> getData() {
        return data;
    }

    public void setData(PageInfo<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Page{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}

