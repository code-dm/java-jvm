package com.codingdm.pattern.decoration;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        // 订一杯浓缩咖啡
        Beverage beverage = new Espresso(); // 1.99
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 浓缩咖啡增加 mocha调料

        beverage = new Mocha(beverage); // 0.2
        beverage = new Mocha(beverage); // 0.2
        beverage = new Mocha(beverage); // 0.2
        beverage = new Soy(beverage);   // 0.5

        System.out.println(beverage.getDescription() + " $" + beverage.cost());


    }
}
