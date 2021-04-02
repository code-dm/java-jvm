package com.codingdm.pattern.decoration;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }


    public double cost() {
        return beverage.cost() + .50;
    }


    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
