package com.javaconcepts.practice;

public class AnimalApp {

    public static void main(String[] args) {

        System.out.println("Guess who i am");

        Animal a1 = new Cat();
        a1.friendlyAnimal();

        System.out.println("Guess who i am");

        Animal a2 = new Dog();
        a2.friendlyAnimal();

        System.out.println("My favourite animal is cat");
    }
}
