package org.example.lec6;

import java.util.Arrays;
import java.util.List;

public class BoundedT {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 7);
        List<String> sList = Arrays.asList("World", "Hello","Is");

        DataSorter<String> sorter1 = new DataSorter<>(sList);
        DataSorter<Integer> sorter2 = new DataSorter<>(list);

        sorter1.getSortedData();
        sorter2.getSortedData();

        IBound bound = new CBound();
        getSorted(bound); //using interface for bounding the type parameter
    }

    public static <T extends IBound> void getSorted(T list) {
//        System.out.println(list.hashCode());
//        list.sort(null);
//        for (T t:list
//             ) {
//            System.out.println(t);
//        }
    }
}

interface IBound {
}

interface IBound1 {
}

class CBound implements IBound, IBound1 {
}
