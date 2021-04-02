package com.codingdm.pattern.decoration;

/**
 * 所有 调料 的抽象类
 * 也就是装饰者类
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
