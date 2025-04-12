package com.basics.java.math;

public class CalculatorApp {

    public static void main(String[] args) {

        Calculator cal = new CalculatorImpl();
       //int total = cal.sum(2,3);

        System.out.println("your int total is: " + cal.sum(2,3));
        System.out.println("your double total is: " + cal.sum(2.50,3.21));

    }
}
