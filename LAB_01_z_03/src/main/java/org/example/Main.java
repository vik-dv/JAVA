package org.example;
// Java lang.

public class Main {
    public static boolean iN(int number) {
        return number < 0;
    }

    public static void main(String[] args) {

        System.out.println("Number = " + "-5 " + iN(-5));
        System.out.println("Number = " + "10 " + iN(10));
    }
}