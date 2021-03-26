package com.codingdm.jvm.gc;


/**
 * @author wudongming1
 * @email dongming1.wu@genscript.com
 * @Date 9/7/2020 11:07 AM
 **/

public class SafepointTest {

    static double sum = 0;

    public static void foo() {
        for (int i = 0; i < 50000000; i++) {
            sum += Math.sqrt(i);
        }
    }

    public static void bar() {
        for (int i = 0; i < 50000000; i++) {
            new Object().hashCode();
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Thread(SafepointTest::foo).start();
        new Thread(SafepointTest::bar).start();
        long end = System.currentTimeMillis();
        System.out.println(end - start); //foo  64 bar 42  all 42
    }

}
