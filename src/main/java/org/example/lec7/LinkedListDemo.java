package org.example.lec7;

public class LinkedListDemo {

    public static void main(String[] args) {
        DataNode<Integer> node2= new DataNode<>(5,null);
        DataNode<Integer> node1 = new DataNode<>(4,node2);
        System.out.println(node1);

        DataNode<Double> n2= new DataNode<>(5.00,null);
        DataNode<Double> n1 = new DataNode<>(4.21,n2); // double is a subtype of number class
        System.out.println(n1);

//        DataNode<Number> n3 = new DataNode<>(5.08,null); // error as it's of Integer type
//        DataNode<Number> n3 = new DataNode<>(5.08,node1); // error as it's of Integer type
//        n3.setNext(node2); // error as it's of Integer type
        DataNode<Number> n3 = new DataNode<>(5.08,node1); // No error on using wildcards now
        n3.setNext(node2);
    }
}
