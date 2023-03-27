package com.study.structural_patterns.adapter._01_before;

import com.study.structural_patterns.adapter._01_before.security.LoginHandler;
import com.study.structural_patterns.adapter._01_before.security.UserDetails;
import com.study.structural_patterns.adapter._01_before.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        UserDetailsService userDetailsService = new UserDetailsService() {
            @Override
            public UserDetails loadUser(String username) {
                return new UserDetails() {
                    @Override
                    public String getUsername() {
                        return "wonpyol";
                    }

                    @Override
                    public String getPassword() {
                        return "1234";
                    }
                };
            }
        };

        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("wonpyol", "1234");
        System.out.println("loginHandler = " + login);
    }


}
