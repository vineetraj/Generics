package org.example.lec1;

public class Demo {
    public static void main(String[] args) {
        Data<String> d1 = new Data<>("hello world");
        System.out.println(d1);

        Data<Integer> d2 = new Data<>(10);
        int x = d2.getData();
        System.out.println(x);

        IData<String> d3 = new Data<>("hello");
        System.out.println(d3.getData());

        Data<String> d4 = new Data<>("data 4");
        BaseData<String> b1 = d4;
    }
}