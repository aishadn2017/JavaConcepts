package com.javaconcepts.oop.inheritence;

import java.util.Scanner;

public class InheritanceApp {

    public static void main(String[] ard) {
        drive();

    }

    public static void drive(){

        Scanner scanner = new Scanner(System.in);
        int input;
        Vehicle v = null;

        do {
            System.out.println("Please enter value test: ");
            input = scanner.nextInt();

            System.out.println("Entered Value is: " + input);

            if (input == 1) {
                v = new Car();
            } else if (input == 2) {
                v = new Bike();
            } else if (input == 3) {
                v = new Boat();
            }

            if (input == 1 || input == 2 || input == 3) {
                startAnyEngine(v);
            }

        } while (input != 0);


    }

    public static void startAnyEngine (Vehicle v) {
        v.startEngine();
    }
}
