package org.example;
//Java lang.


public class Main {

    // Переменные всех примитивных типов + String
    byte    byteVar    = 127;
    short   shortVar   = 32000;
    int     intVar     = 2_000_000;
    long    longVar    = 9_000_000_000L;
    float   floatVar   = 3.14f;
    double  doubleVar  = 2.718281828;
    char    charVar    = 'A';
    boolean boolVar    = true;
    String  stringVar  = "Hello, Java!";

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.byteVar);
        System.out.println(m.shortVar);
        System.out.println(m.intVar);
        System.out.println(m.longVar);
        System.out.println(m.floatVar);
        System.out.println(m.doubleVar);
        System.out.println(m.charVar);
        System.out.println(m.boolVar);
        System.out.println(m.stringVar);
    }
}