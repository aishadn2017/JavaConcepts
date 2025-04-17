package com.javaconcepts.practice;

import java.util.Scanner;

public class Counting {

    public static void main (String[]arg){

        Scanner s = new Scanner(System.in);
        int i =100;

        do {


            System.out.print("Please enter a number or 0 to exit: ");

            try {
                i = s.nextInt();
            }catch (Exception m){
                s.next();
                continue;
            }



            for (int in = 1; in <= i; in++) {


                System.out.println(in);


            }
        }  while (i != 0);
        System.out.println("Thank you");

    }
}
