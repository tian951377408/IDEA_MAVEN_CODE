package com.lemon.day10;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-28 15:23
 * @Desc：
 **/
public class PeopleInfo {
    @Excel(name="id")
    private int id;

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone ( String phone ) {
        this.phone = phone;
    }

    @Excel(name="name")
    private String name;
    @Excel(name="address")
    private String address;
    @Excel(name="phone")
    private String phone;
}
