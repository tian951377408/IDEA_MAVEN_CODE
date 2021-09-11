package com.lemon.day10;

import java.util.List;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-28 17:22
 * @Desc：
 **/
public class MemberInfo {
    private String name;
    private int age;
    private Address address;

    public List<String> getHobby () {
        return hobby;
    }

    public void setHobby ( List<String> hobby ) {
        this.hobby = hobby;
    }

    private String isSingle;
    private String phone;
    private List<String> hobby;


    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public Address getAddress () {
        return address;
    }

    public void setAddress ( Address address ) {
        this.address = address;
    }

    public String getIsSingle () {
        return isSingle;
    }

    public void setIsSingle ( String isSingle ) {
        this.isSingle = isSingle;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone ( String phone ) {
        this.phone = phone;
    }

    public String getData () {
        return data;
    }

    public void setData ( String data ) {
        this.data = data;
    }

    public String getDatatime () {
        return datatime;
    }

    public void setDatatime ( String datatime ) {
        this.datatime = datatime;
    }

    public List<Address> getProvinces () {
        return provinces;
    }

    public void setProvinces ( List<Address> provinces ) {
        this.provinces = provinces;
    }

    private String data;
    private String datatime;
    private List<Address> provinces;





}

