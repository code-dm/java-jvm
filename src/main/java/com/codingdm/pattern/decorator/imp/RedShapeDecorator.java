package com.codingdm.pattern.decorator.imp;


import com.codingdm.pattern.decorator.Shape;

/**
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @Date 10/23/2020 3:07 PM
 **/
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
