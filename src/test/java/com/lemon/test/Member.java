package com.lemon.test;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-24 23:17
 * @Desc：
 **/
public class Member {
    public Member ( String name, int age, double height ) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String name;
    private int age;
    private double height;

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }



    public double getHeight () {
        return height;
    }

    public void setHeight ( double height ) {
        this.height = height;
    }



}
