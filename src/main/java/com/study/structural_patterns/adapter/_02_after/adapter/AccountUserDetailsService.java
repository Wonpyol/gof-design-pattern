package com.study.structural_patterns.adapter._02_after.adapter;

import com.study.structural_patterns.adapter._02_after.adaptee.AccountService;
import com.study.structural_patterns.adapter._02_after.adaptee.AccountUserDetails;
import com.study.structural_patterns.adapter._02_after.adaptee.UserDetails;
import com.study.structural_patterns.adapter._02_after.target.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
