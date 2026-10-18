package org.example;
// Java lang.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void prS(int number) {
        if (number < 0) {
            System.out.println("Sign " + number + " negative");
        } else if (number > 0) {
            System.out.println("Sign " + number + " positive");
        } else {
            System.out.println("Sign = 0  zero");
        }
    }

    public static void main(String[] args) {
        // Пример:
        prS(-7);
        prS(42);
        prS(0);
    }
}