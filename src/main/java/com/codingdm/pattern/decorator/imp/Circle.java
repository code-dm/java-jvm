package com.codingdm.pattern.decorator.imp;

import com.codingdm.pattern.decorator.Shape;

/**
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @Date 10/23/2020 3:04 PM
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
