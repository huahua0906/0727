package com.youkeda.application.art.member.service;

import com.youkeda.application.art.member.param.CompanyQueryParam;
import com.youkeda.model.Company;
import java.util.List;

public interface CompanyService{

    Company save(Company company);

    Company find(CompanyQueryParam param);

    List<Company> queryByAccountId(String accountId);

    Company getByDomain(String domainUrl);

    void delete(String companyId);

    Company get(String companyId);
}