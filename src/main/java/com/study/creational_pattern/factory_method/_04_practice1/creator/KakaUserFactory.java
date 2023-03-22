package com.study.creational_pattern.factory_method._04_practice1.creator;

import com.study.creational_pattern.factory_method._04_practice1.product.KakaUser;
import com.study.creational_pattern.factory_method._04_practice1.product.User;

public class KakaUserFactory extends UserFactory{
    @Override
    protected User createUser() {
        return new KakaUser();
    }
}
