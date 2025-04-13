package com.javaconcepts.hello;

import java.util.Scanner;

public class HelloApp {

    public static void main(String[] arg) {


        String str="";
        do {


            Scanner s = new Scanner(System.in);
            System.out.print("Please enter your name: ");
             str = s.next();
            System.out.println("Welcome " + str);

        } while (!str.equalsIgnoreCase("end"));


    }
}
