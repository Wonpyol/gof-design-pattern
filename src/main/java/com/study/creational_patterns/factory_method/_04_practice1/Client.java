package com.study.creational_patterns.factory_method._04_practice1;

import com.study.creational_patterns.factory_method._04_practice1.creator.KakaUserFactory;
import com.study.creational_patterns.factory_method._04_practice1.creator.NaverUserFactory;
import com.study.creational_patterns.factory_method._04_practice1.creator.UserFactory;
import com.study.creational_patterns.factory_method._04_practice1.product.User;

public class Client {

    public static void main(String[] args) {
        UserFactory userFactory = new NaverUserFactory();
        User user = userFactory.newInstance();
        System.out.println("user = " + user);

        UserFactory userFactory1 = new KakaUserFactory();
        User user1 = userFactory1.newInstance();
        System.out.println("user1 = " + user1);
    }
}
