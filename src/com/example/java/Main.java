package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
            This program creates an ArrayList and adds several state name into it. It then
            prints out the list and then removes one element from the ArrayList. It reprints
            the list and prints an element at a particular index value
         */
        List <String> list = new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("The second state is: " + state);

        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position " + pos);


    }
}
