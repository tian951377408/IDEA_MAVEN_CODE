package com.lemon.day10.zuoye;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.poi.ss.formula.functions.T;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-28 21:46
 * @Desc：
 **/
public class HomeWork {
    public static void main ( String[] args ) throws IOException {
        subject02();
    }
    public static void subject02() throws IOException {
        String jsonStr="{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }, { \"name\": \"广东\", \"capital\": \"广 州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }";
        JsonRootBean jsonRootBean=JSONObject.parseObject(jsonStr,JsonRootBean.class);
        ObjectMapper objectMapper=new ObjectMapper(new YAMLFactory());
//        String str=objectMapper.writeValueAsString(jsonRootBean);
//        System.out.println(str);
        objectMapper.writeValue(new File("output.yaml"),jsonRootBean);
    }
    public static void subject01(){
        File file=new File("src/test/resources/api_testcases_futureloan_v1.xls");
        ImportParams importParams = new ImportParams();
        importParams.setStartSheetIndex(0);
        importParams.setSheetNum(2);
        List<Test1> listDatas=ExcelImportUtil.importExcel(file,Test1.class,importParams);
        Object[] arr=listDatas.toArray();
        for (Object arrs:arr) {
            Test1 test1=(Test1)arrs;
            System.out.println(test1.getCaseId());
            System.out.println(test1.getInterfaceName());
            System.out.println(test1.getMethod());
            System.out.println(test1.getExpected());
            System.out.println(test1.getRequestHeader());
            System.out.println(test1.getUrl());
            System.out.println(test1.getTitle());
            System.out.println(test1.getInputParams());



        }
    }
}
