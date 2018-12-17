package com.qf.pojo;

import java.util.List;

public class PageVo<T> {
    private int totalCount;//商品总数
    private int pageCount;//每页显示的数量
    private int totalPage;//一共有几页
    private int currentPage;//当前是第几页
    private List<T> data;//当前页的所有数据
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public List<T> getData() {
        return data;
    }
    public void setData(List<T> data) {
        this.data = data;
    }
    public PageVo() {
        super();
        // TODO Auto-generated constructor stub
    }

}

