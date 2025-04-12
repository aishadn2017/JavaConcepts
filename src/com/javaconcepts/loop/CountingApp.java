package com.basics.java.loop;

import java.util.Scanner;

public class CountingApp {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int maxCountingSize = 100;

        while (maxCountingSize != 0) {
            System.out.print("Enter counter size or 0 to exit: ");

            try {
                maxCountingSize = myObj.nextInt();
            } catch (Exception m) {
                System.out.println("Please enter only numbers");
                myObj.next();
                continue;
            }


            for (int i = 1; i <= maxCountingSize; i++) {

                System.out.println(i);
            }
        }
        System.out.print("Thank you!");
    }

    public void printCounting() {

        int maxCountingSize = 100;

        for (int i = 1; i <= maxCountingSize; i++) {
            System.out.println(i);
        }

    }


}
