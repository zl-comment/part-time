package com.zx.beans;

import java.util.List;

public class Page<T> {
    private int currentPage;//当前页
    private int pageSize;//每页显示条数
    private int dataCount;//总条数
    private int pageCount;//总页数
    private List<T> datas;//数据


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getDataCount() {
        return dataCount;
    }

    public void setDataCount(int dataCount) {
        this.dataCount = dataCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", dataCount=" + dataCount +
                ", pageCount=" + pageCount +
                ", datas=" + datas +
                '}';
    }
}
