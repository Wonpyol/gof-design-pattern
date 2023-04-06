package com.study.structural_patterns.composite._02_after.composite;

import com.study.structural_patterns.composite._02_after.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * composite 은 leaf 타입을 참조하면 안됨
 * client 에서 하던일을 컴포짓으로 변경됨 --> getPrice()
 */
public class Bag implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
