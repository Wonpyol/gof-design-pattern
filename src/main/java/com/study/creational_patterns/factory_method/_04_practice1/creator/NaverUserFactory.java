package com.study.creational_patterns.factory_method._04_practice1.creator;

import com.study.creational_patterns.factory_method._04_practice1.product.NaverUser;
import com.study.creational_patterns.factory_method._04_practice1.product.User;

public class NaverUserFactory extends UserFactory{
    @Override
    protected User createUser() {
        return new NaverUser();
    }
}
