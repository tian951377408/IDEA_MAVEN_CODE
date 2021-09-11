package com.lemon.day10;

import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.poi.sl.usermodel.ObjectMetaData;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-28 17:13
 * @Desc：
 **/
public class YamlTest {
    public static void main ( String[] args ) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper(new YAMLFactory());
        MemberInfo memberInfo=objectMapper.readValue(new File("src/test/resources/test.yaml"),MemberInfo.class);
        System.out.println(memberInfo.getName());
        System.out.println(memberInfo.getAge());
        System.out.println(memberInfo.getPhone());
        System.out.println(memberInfo.getData());
        System.out.println(memberInfo.getDatatime());
        System.out.println(memberInfo.getIsSingle());
        System.out.println(memberInfo.getAddress().getProvince());
        System.out.println(memberInfo.getAddress().getCity());
        List<Address> provinces=memberInfo.getProvinces();
        for (Address address:provinces){
            System.out.println(address.getProvince());
            System.out.println(address.getCity());
        };
        List<String> hobby=memberInfo.getHobby();
        for (String hobby1:hobby){
            System.out.println(hobby1);
        }
        objectMapper.writeValue(new File("output.yaml"),memberInfo);
    }
}
