package com.lemon.zuoye;

import cn.afterturn.easypoi.excel.annotation.Excel;
import org.testng.annotations.Test;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-29 23:27
 * @Desc：
 **/
public class ExcelData {
    @Excel(name="序号(caseId)")
    private int caseId;
    private String interfacename;
    private String title;
    private String requestHeader;
    private String method;
    private String url;

    public int getCaseId () {
        return caseId;
    }

    public void setCaseId ( int caseId ) {
        this.caseId = caseId;
    }

    public String getInterfacename () {
        return interfacename;
    }

    public void setInterfacename ( String interfacename ) {
        this.interfacename = interfacename;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public String getRequestHeader () {
        return requestHeader;
    }

    public void setRequestHeader ( String requestHeader ) {
        this.requestHeader = requestHeader;
    }

    public String getMethod () {
        return method;
    }

    public void setMethod ( String method ) {
        this.method = method;
    }

    public String getUrl () {
        return url;
    }

    public void setUrl ( String url ) {
        this.url = url;
    }

    public String getInputParams () {
        return inputParams;
    }

    public void setInputParams ( String inputParams ) {
        this.inputParams = inputParams;
    }

    public String getExpected () {
        return expected;
    }

    public void setExpected ( String expected ) {
        this.expected = expected;
    }

    private String inputParams;
    private String expected;
}
