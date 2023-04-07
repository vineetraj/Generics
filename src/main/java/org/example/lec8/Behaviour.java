package org.example.lec8;

import java.util.ArrayList;

public class Behaviour {
    public static void main(String[] args) {
        ArrayList<String > arr = new ArrayList<>();
        arr.add("hh");
        arr.add("yoyo");
        method(arr);
        System.out.println(arr); //prints all elements in this ArrayList

    }

    private static void method(ArrayList arr) {
    arr.add(1);
    arr.add("kiki");
    arr.add(true);
    }

}
