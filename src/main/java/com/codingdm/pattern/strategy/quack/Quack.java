package com.codingdm.pattern.strategy.quack;

import com.codingdm.pattern.strategy.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎的叫");
    }
}
