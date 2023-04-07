package org.example.lec4;

import java.util.ArrayList;
import java.util.List;

public class SubtypingDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        Integer i = Integer.valueOf(11);
        obj = i;

        //creating a list of boxes
        List <Box<Integer>> bList = new ArrayList<>();
        //we can add as squarebox extends box class
        bList.add(new SquareBox<>(List.of(1,2,3)));
        bList.add(new Box<>(List.of(8,5,7,6)));

// Both type arguments should be the same.. so below code is not working
//        List<Number> l1 = new ArrayList<Integer>();
//        ArrayList<Number> l2 = new ArrayList<Integer>();
    }
}
