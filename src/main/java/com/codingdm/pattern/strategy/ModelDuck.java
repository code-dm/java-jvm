package com.codingdm.pattern.strategy;

import com.codingdm.pattern.strategy.fly.FlyNoWay;
import com.codingdm.pattern.strategy.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }


}
