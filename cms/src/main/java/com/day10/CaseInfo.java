package com.day10;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * @author wq
 * @since 2022-06-07 9:55
 */

public class CaseInfo {
    @Excel(name = "序号(caseId)")
    private Integer caseId;
    @Excel(name = "用例标题(title)")
    private String title;
    @Excel(name = "接口模块(interfaces)")
    private String interfaces;
    @Excel(name = "请求头(requestHeader)")
    private String requestHeader;
    @Excel(name = "请求方式(method)")
    private String method;
    @Excel(name = "接口地址(url)")
    private String url;
    @Excel(name = "参数输入(inputParams)")
    private String inputParams;
    @Excel(name = "期望返回结果(expected)")
    private String expected;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    public String getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInputParams() {
        return inputParams;
    }

    public void setInputParams(String inputParams) {
        this.inputParams = inputParams;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public CaseInfo() {
    }

    public CaseInfo(Integer caseId, String title, String interfaces, String requestHeader, String method, String url, String inputParams, String expected) {
        this.caseId = caseId;
        this.title = title;
        this.interfaces = interfaces;
        this.requestHeader = requestHeader;
        this.method = method;
        this.url = url;
        this.inputParams = inputParams;
        this.expected = expected;
    }

    @Override
    public String toString() {
        return "CaseInfo{" +
                "caseId=" + caseId +
                ", title='" + title + '\'' +
                ", interfaces='" + interfaces + '\'' +
                ", requestHeader='" + requestHeader + '\'' +
                ", method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", inputParams='" + inputParams + '\'' +
                ", expected='" + expected + '\'' +
                '}';
    }
}
