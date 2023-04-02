package com.study.structural_patterns.adapter._02_after;

import com.study.structural_patterns.adapter._02_after.adaptee.AccountService;
import com.study.structural_patterns.adapter._02_after.adapter.AccountUserDetailsService;
import com.study.structural_patterns.adapter._02_after.adaptee.LoginHandler;
import com.study.structural_patterns.adapter._02_after.target.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("wonpyol", "wonpyol");
        System.out.println(login);
    }
}
