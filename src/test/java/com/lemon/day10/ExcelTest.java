package com.lemon.day10;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import jdk.internal.dynalink.linker.LinkerServices;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-28 15:22
 * @Desc：
 **/
public class ExcelTest {
    public static void main ( String[] args ) throws IOException {
        File file=new File("src/test/resources/Excel_test.xlsx");
        ImportParams importParams=new ImportParams();
        importParams.setStartSheetIndex(0);
//        importParams.setSheetNum(2);
        importParams.setStartRows(0);
        List<PeopleInfo> allDatas=ExcelImportUtil.importExcel(file,PeopleInfo.class,importParams);
        for (PeopleInfo peopleInfo : allDatas){
            System.out.print(peopleInfo.getId());
            System.out.print(peopleInfo.getName());
            System.out.print(peopleInfo.getAddress());
            System.out.print(peopleInfo.getPhone());
            System.out.println();
        }
        ExportParams exportParams=new ExportParams();
        exportParams.setSheetName("login");
        PeopleInfo peopleInfo=new PeopleInfo();
        peopleInfo.setId(1);
        peopleInfo.setName("名字");
        peopleInfo.setAddress("上海的");
        peopleInfo.setPhone("123456789");
        List<PeopleInfo> list =new ArrayList<PeopleInfo>();
        list.add(peopleInfo);
        Workbook workbook=ExcelExportUtil.exportExcel(exportParams,PeopleInfo.class,allDatas);
        workbook.write(new FileOutputStream(new File("output.xlsx")));
    }
}
