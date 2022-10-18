package by.itstep.vikvik.controller;

public class B extends A {
    public int value = 2;
    public static int svalue = 2;

    public static void stest() {
        System.out.println(" static test from B class");
    }

    public void test() {
        System.out.println("test from B class");
    }
}
