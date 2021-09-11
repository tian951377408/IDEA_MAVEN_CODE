package com.lemon.day11;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-29 16:58
 * @Desc：
 **/
public class ExcelData {
    @Excel(name="mobilephone")
    private String mobilephone;

    public String getMobilephone () {
        return mobilephone;
    }

    public void setMobilephone ( String mobilephone ) {
        this.mobilephone = mobilephone;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    @Excel(name="password")
    private String password;

}
