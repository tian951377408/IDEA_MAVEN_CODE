package com.lemon.day11;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-29 16:40
 * @Desc：
 **/
public class DataDrive {


    @Test(dataProvider = "getDatas02")
    public void loginFailure(ExcelData excelData){
        System.out.println("手机号码："+excelData.getMobilephone()+"密码："+excelData.getPassword());
    }

    @DataProvider
    public Object[] getDatas02()  {
        ImportParams importParams=new ImportParams();
        File file=new File("src/test/resources/case_data.xlsx");
        List<ExcelData> listdatas=ExcelImportUtil.importExcel(file,ExcelData.class,importParams);
        Object[] datas=listdatas.toArray();
        return datas;

    }
}

