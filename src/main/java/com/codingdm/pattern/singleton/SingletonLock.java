package com.codingdm.pattern.singleton;


/**
 * @author wudongming1
 * 手写单例模式
 * @email dongming1.wu@genscript.com
 * @Date 10/23/2020 3:31 PM
 **/

public class SingletonLock {
    private static volatile SingletonLock singleton = null;

    private SingletonLock(){
    }

    public static SingletonLock getInstance(){
        if(singleton == null){
            synchronized (SingletonLock.class){
                if(singleton == null){
                    singleton = new SingletonLock();
                }
            }
        }
        return singleton;
    }
}
