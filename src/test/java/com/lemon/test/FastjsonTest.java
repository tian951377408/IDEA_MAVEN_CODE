package com.lemon.test;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-24 23:16
 * @Desc：
 **/
public class FastjsonTest {
    public static <map> void main ( String[] args ) {

        String json = "{\"name\":\"张三\",\"age\":18,\"height\":100}";
//        Member student =JSONObject.parseObject(json,Member.class);
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getHeight());
//        Member member=new Member("jack",11,110.9);
//        System.out.println(member.getHeight());
//        System.out.println(member.getAge());
//        System.out.println(member.getName());
//        String a =JSONObject.toJSONString(member);
//        System.out.println(a);
//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("name","小礼");
//        map.put("age",11);
//        String b=JSONObject.toJSONString(map);
//        System.out.println(b);
//        System.out.println(map);
//        Map<String,Object> c=JSONObject.parseObject(json);
//        System.out.println(c.get("name"));
String jsonstr="[{\"name\": \"黑龙江\",\"capital\": \"哈尔滨\"},{\"name\": \"广东\",\"capital\": \"广州\"},{\"name\": \"湖南\",\"capital\": \"长沙\"}]";
        List<City> list=JSONObject.parseArray(jsonstr,City.class);
        for (City a:list) {
            System.out.println(a.getCapital());
            System.out.println(a.getName());

        }

    }
}
