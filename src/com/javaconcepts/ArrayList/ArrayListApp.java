package com.javaconcepts.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Aisha");

        for (int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
