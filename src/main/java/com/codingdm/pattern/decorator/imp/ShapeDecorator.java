package com.codingdm.pattern.decorator.imp;


import com.codingdm.pattern.decorator.Shape;

/**
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @Date 10/23/2020 3:06 PM
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
