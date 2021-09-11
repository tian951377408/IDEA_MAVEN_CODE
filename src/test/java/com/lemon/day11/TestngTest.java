package com.lemon.day11;

import netscape.javascript.JSUtil;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-29 14:16
 * @Desc：
 **/
public class TestngTest {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("全局初始化");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("打开浏览器");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("打开登录网址");
    }

    @Test
    public void loginFailure(){
        System.out.println("登录失败");
    }
    @Test
    public void registerFail(){
        String expected = "注册失败";

        String actual="注册成功";
        Assert.assertFalse(expected.equals(actual));
    }
    @Test
    public void loginFailure01(){
        System.out.println("手机号称超过11位");
    }
    @Test(priority = 1)
    public void loginFailure02(){
        System.out.println("手机号码为null");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("关闭登录网址");
    }
    @AfterClass
    public void afterMClass(){
        System.out.println("关闭浏览器");
    }
    @Test
    public void registerSuccess(){
        System.out.println("注册手机号成功");
    }
    @Test
    @Parameters (value = {"mobilephone","password"})
    public void loginSuccess(String mobilephone,String password){
        System.out.println(mobilephone);
        System.out.println(password);
    }
}
