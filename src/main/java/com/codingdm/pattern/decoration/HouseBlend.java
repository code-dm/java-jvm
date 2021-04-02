package com.codingdm.pattern.decoration;

/**
 * 星巴克咖啡
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "Espresso";
    }

    public double cost() {
        return 0.89;
    }
}
