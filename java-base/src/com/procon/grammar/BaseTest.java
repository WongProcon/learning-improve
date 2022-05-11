package com.procon.grammar;


/**
 * @author huang
 */
public class BaseTest {

    public static void main(String[] args) {
        // -XX:AutoBoxCacheMax=256
        Integer f1 = 100,f2=100,f3=150,f4=150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }
}
