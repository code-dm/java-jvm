package com.codingdm.pattern.strategy.quack;

import com.codingdm.pattern.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
