package com.codingdm.pattern.strategy.fly;

import com.codingdm.pattern.strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不能飞");
    }
}
