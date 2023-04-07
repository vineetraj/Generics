package org.example.lec4;

import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {
        //This is generic type
        Box<Integer> genBox = new Box<>(List.of(1,2,3));
        for (Integer i : genBox.getA()
             ) {
            System.out.println(i);
        }
        //This is raw type
        Box rawBox = new Box(List.of(1,2,"hello"));
    }
}
