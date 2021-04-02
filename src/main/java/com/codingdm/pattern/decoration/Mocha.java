package com.codingdm.pattern.decoration;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage b){
        this.beverage = b;
    }


    public double cost() {
        return beverage.cost() + .20;
    }


    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
