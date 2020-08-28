package com.codingdm.jvm.custom;


/**
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @Date 8/28/2020 5:06 PM
 **/
public class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
