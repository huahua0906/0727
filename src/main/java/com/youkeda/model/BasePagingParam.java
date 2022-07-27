package com.youkeda.model;

import java.io.Serializable;

public abstract class BasePagingParam<T> implements Serializable{

    private int pagination = 0;

    private int pageSize = 15;

    public int getPagination(){
        return pagination;
    }

    public int getPagination(int pagination){
        this.pagination = pagination;
        return (T)this;
    }

    public int getPageSize(){
        return pageSize;
    }

    public int getPageSize(int pageSize){
        this.pageSize = pageSize;
        return (T)this;
    }
}