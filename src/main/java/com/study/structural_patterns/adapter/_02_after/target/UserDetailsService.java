package com.study.structural_patterns.adapter._02_after.target;

import com.study.structural_patterns.adapter._02_after.adaptee.UserDetails;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
