package com.study.structural_patterns.adapter._02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
