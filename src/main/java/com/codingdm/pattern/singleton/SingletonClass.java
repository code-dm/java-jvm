package com.codingdm.pattern.singleton;


/**
 * 匿名内部静态类
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @Date 10/23/2020 3:44 PM
 **/
public class SingletonClass {
    private SingletonClass() {
    }

    private static class Holder{
        private static SingletonClass singletonClass = new SingletonClass();
    }

    public static SingletonClass getInstance(){
        return Holder.singletonClass;
    }
}

