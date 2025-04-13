package com.javaconcepts.array;

public class ArrayApp {
    public static void main(String[] args) {

        MyArrayExample obj = new MyArrayExample();

        String[] arr = new String[10];
        arr[0] = "Aisha";
        arr[8] = "Ali";

        String[] arr2 = {"Aisha", "Ali", "Ahmad"};
        obj.printArray(arr2);
    }

}

class MyArrayExample{
    public void printArray(String[] familyNames){
        System.out.println("My array size: " + familyNames.length);
        for (int a=0; a < familyNames.length; a++){
            System.out.println(familyNames[a]);
        }
    }
}
