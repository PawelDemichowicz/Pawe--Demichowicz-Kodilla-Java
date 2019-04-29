package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wrpowadzenie do testowania oprogramowania");

        Calculator count = new Calculator();

        if((count.add(5,10)) == 15)
            System.out.println("Test 1.0 ok");
        else
            System.out.println("Error");

        if((count.subtract(10,5)) == 5)
            System.out.println("Test 2.0 ok");
        else
            System.out.println("Error");
    }
}
