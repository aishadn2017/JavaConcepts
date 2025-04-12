package com.javaconcepts.app;

import com.javaconcepts.encapsulation.Student;
import com.javaconcepts.oop.inheritence.Bike;
import com.javaconcepts.oop.inheritence.Boat;
import com.javaconcepts.oop.inheritence.Car;
import com.javaconcepts.oop.inheritence.Vehicle;

import java.util.Scanner;

public class Application {

    public static void main(String[] ard) {
        //drive();

        Student s1 = new Student();
        s1.setName("Ali");
        System.out.println(s1.getName());
    }

    public static void drive(){

        Scanner scanner = new Scanner(System.in);
        int input;
        Vehicle v;

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
            } else {
                v = new Vehicle();
            }

            startAnyEngine(v);

        } while (input != 0);


    }

    public static void startAnyEngine (Vehicle v) {
        v.startEngine();
    }
}
