package com.youkeda.application.art.member.param;

public class CompanyQueryParam{

    private String code;

    private String domain;

    public static CompanyQueryParam create(){

        return new CompanyQueryParam();
    }

    public String getCode(){
        return code;
    }
    public void setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
        return this;
    }
}