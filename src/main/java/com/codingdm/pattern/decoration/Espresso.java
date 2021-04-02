package com.codingdm.pattern.decoration;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";
    }


    public double cost() {
        return 1.99;
    }
}
