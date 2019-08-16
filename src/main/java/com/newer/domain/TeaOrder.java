package com.newer.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class TeaOrder implements Serializable {

    private Integer tid;
    private String detail;
    private Integer num;
    private Integer price;
    private Timestamp orderTime;

    public Integer getTid() {
        return tid;
    }

    public String getDetail() {
        return detail;
    }

    public Integer getNum() {
        return num;
    }

    public Integer getPrice() {
        return price;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
}
