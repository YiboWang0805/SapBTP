package com.sapTest.boot.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("book")
public class Book {

    /**
     * 所有属性都应该在数据库中
     */
    private int ID;
    private String code;
    private String name;
    private String author;
    private double price;
    private Date date;
    private boolean status;

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

}
