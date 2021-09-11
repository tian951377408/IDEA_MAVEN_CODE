package com.lemon.test;

import java.io.*;
import java.util.Properties;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-28 14:47
 * @Desc：
 **/
public class PropertiesTest {
    public static void main ( String[] args ) throws IOException {
        Properties properties=new Properties();

        InputStream inputStream=new FileInputStream(new File("src/test/resources/test.properties"));
        properties.load(inputStream);
        String a =properties.getProperty("address");
        System.out.println(a);
        System.out.println(properties.getProperty("port"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));

    }
}
