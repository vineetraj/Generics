package org.example.lec5;

public class GenericMethod {

    public static<T> String concat(T data ){
        return "Data supplied is: "+ data;
    }

    public static void main(String[] args) {
        System.out.println(concat("Yo Yo"));
        System.out.println(concat(43));
    }
}
