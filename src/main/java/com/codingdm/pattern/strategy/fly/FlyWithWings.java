package com.codingdm.pattern.strategy.fly;

import com.codingdm.pattern.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("我可以飞");
    }
}
