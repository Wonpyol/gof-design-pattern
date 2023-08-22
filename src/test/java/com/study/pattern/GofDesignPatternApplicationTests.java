package com.study.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootTest
class GofDesignPatternApplicationTests {

    @Test
    void contextLoads() {
        Wonpyo link = link(new Wonpyo1(), new Wonpyo2(), new Wonpyo3());
        System.out.println("link = " + link);

    }

    public Wonpyo link(Wonpyo first, Wonpyo... chain) {
        Wonpyo head = first;
        System.out.println("first:"+System.identityHashCode(first));
        for (Wonpyo nextInChain : chain) {
            first.next = nextInChain;
            first = nextInChain;
            System.out.println();

        }
        System.out.println();


        return head;
    }

    static abstract class Wonpyo {
        private Wonpyo next;
        public abstract void print();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Wonpyo wonpyo = (Wonpyo) o;
            return Objects.equals(next, wonpyo.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(next);
        }
    }
//
    static class Wonpyo1 extends Wonpyo {

        @Override
        public void print() {
            System.out.println("Test");
        }



    }

    static class Wonpyo2 extends Wonpyo {

        @Override
        public void print() {
            System.out.println("Test1");
        }

    }

    static class Wonpyo3 extends Wonpyo {

        @Override
        public void print() {
            System.out.println("Test1");
        }

    }

    @Test
    void phone() {
        Phone phone1 = new Phone();
        phone1.setNumber(1);
        phone1.print();

        Phone phone2 = phone1;
        phone2.setNumber(2);
        phone1.print();

        phone1.setNumber(3);
        phone2.print();

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = a;
        b.add(4);
        a.add(5);
        System.out.println("a = " + a);


    }

    static class Phone {
        private Phone next;
        private int number;

        public void print() {
            System.out.println("number = " + this.number);
        }

        public void setNumber(int number) {
            this.number = number;
        }


    }


}
