package com.study.structural_patterns.adapter._03_java;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {

    public static void main(String[] args) {
        //collection
        List<String> strings = List.of("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        System.out.println("enumeration = " + enumeration);

        ArrayList<String> list = Collections.list(enumeration);
        System.out.println("list = " + list);

        //io
        try (InputStream is = new FileInputStream("input.txt")) {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            while (reader.ready()) {
                System.out.println("reader = " + reader.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
