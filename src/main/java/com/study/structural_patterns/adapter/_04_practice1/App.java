package com.study.structural_patterns.adapter._04_practice1;

import com.study.structural_patterns.adapter._04_practice1.adapter.TurkeyAdapter;
import com.study.structural_patterns.adapter._04_practice1.adpaptee.MallardDuck;
import com.study.structural_patterns.adapter._04_practice1.adpaptee.WildTurkey;
import com.study.structural_patterns.adapter._04_practice1.target.Duck;

public class App {
    public static void main(String[] args) {

        WildTurkey wildTurkey = new WildTurkey();
        System.out.println("The Turkey says..");
        wildTurkey.gobble();
        wildTurkey.fly();

        MallardDuck mallardDuck = new MallardDuck();
        System.out.println("The Duck says..");
        mallardDuck.quack();
        mallardDuck.fly();

        //여기가 포인트 --> 기존코드 변경 없이 새로운 기능 추가함
        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        System.out.println("The turkeyAdapter say..");
        turkeyAdapter.quack();
        turkeyAdapter.fly();





    }
}
