package org.example.lec7;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

    //Not a generic method now
    public static void displayData(List<? super Integer> list) {
        for (Object t : list
        ) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        List<Number> lst1 = new ArrayList<>();
        lst.add(5);
        lst.add(10);
        lst1.add(50);
        lst1.add(100);

        displayData(lst);
        displayData(lst1);

        //All below are valid syntax
        List<?> l1 = new ArrayList<>();
        List<? extends Number> l2 = new ArrayList<Number>();
        List<? extends Number> l3 = new ArrayList<Integer>();
//        l2.add(12); // error -> Read Only
//        l3.add(12); // error -> Read Only
        List<? super Integer> l4 = new ArrayList<Number>();
        Number n = 45;
        Integer i = 56;
//        l4.add(n); // error -> Lower bound can only add integers
        l4.add(i); //no error

    }
}
