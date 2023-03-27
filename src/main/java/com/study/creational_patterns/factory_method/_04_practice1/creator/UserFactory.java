package com.study.creational_patterns.factory_method._04_practice1.creator;

import com.study.creational_patterns.factory_method._04_practice1.product.User;

public abstract class UserFactory {
    public User newInstance() { //이놈을 만들줄 알아야함!
        User user = createUser();
        user.signUp();
        return user;
    }
    protected abstract User createUser();
}
