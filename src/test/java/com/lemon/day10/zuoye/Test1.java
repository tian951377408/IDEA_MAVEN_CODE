package com.lemon.day10.zuoye;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * @Project: java_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: java32期 T0123
 * @Author: tian
 * @Create: 2021-08-28 21:47
 * @Desc：
 **/
public class Test1 {
    @Excel(name="序号(caseId)")
    private int caseId;
    @Excel(name="接口模块(interface)")
    private String interfaceName;

    public int getCaseId () {
        return caseId;
    }

    public void setCaseId ( int caseId ) {
        this.caseId = caseId;
    }

    public String getInterfaceName () {
        return interfaceName;
    }

    public void setInterfaceName ( String interfaceName ) {
        this.interfaceName = interfaceName;
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

    @Excel(name="用例标题(title)")
    private String title;
    @Excel(name="请求头(requestHeader)")
    private String requestHeader;
    @Excel(name="请求方式(method)")
    private String method;
    @Excel(name="接口地址(url)")
    private String url;
    @Excel(name="参数输入(inputParams)")
    private String inputParams;
    @Excel(name="期望返回结果(expected)")
    private String expected;


}
