package com.codingdm.pattern.factory.simple;

/**
 * 披萨的创建工厂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type)) {
            pizza = new CheesePizza();
        }else if("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
