package com.study.creational_pattern.factory_method._03_java;

import java.util.Calendar;
import java.util.Locale;

public class CalenderExample {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass());
        //매개변수에 따라 구현체가 달라짐
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
    }
}
