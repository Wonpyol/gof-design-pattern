package com.study.structural_patterns.bridge._04_practice1.refined_abstraction;

import com.study.structural_patterns.bridge._04_practice1.abstraction.BasicRemote;
import com.study.structural_patterns.bridge._04_practice1.implementaion.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
