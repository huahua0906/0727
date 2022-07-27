package com.youkeda.application.art.member.service;

import com.youkeda.application.art.member.model.Account;
import com.youkeda.application.art.member.model.User;
import com.youkeda.application.art.member.param.AccountQueryParam;
import com.youkeda.model.Paging;

public interface AccountService{

    Account save(Account account);

    void delete(String accountId);

    Paging<Account> query(AccountQueryParam param);

    List<Account> query(String companyId, AccountQueryParam param);


}