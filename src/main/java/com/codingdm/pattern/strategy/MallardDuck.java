package com.codingdm.pattern.strategy;

import com.codingdm.pattern.strategy.Duck;
import com.codingdm.pattern.strategy.fly.FlyWithWings;
import com.codingdm.pattern.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
