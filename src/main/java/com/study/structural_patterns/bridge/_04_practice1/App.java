package com.study.structural_patterns.bridge._04_practice1;

import com.study.structural_patterns.bridge._04_practice1.abstraction.BasicRemote;
import com.study.structural_patterns.bridge._04_practice1.concreteImpl.Radio;
import com.study.structural_patterns.bridge._04_practice1.concreteImpl.Tv;
import com.study.structural_patterns.bridge._04_practice1.implementaion.Device;
import com.study.structural_patterns.bridge._04_practice1.refined_abstraction.AdvancedRemote;

public class App {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());

    }

    public static void testDevice(Device device) {
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();


    }
}
