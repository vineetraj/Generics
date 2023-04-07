package org.example.lec7;

public class DataNode<E> {
    private E data; //data
    private DataNode<? extends Number> next; //ref to next node

    public DataNode(E data, DataNode<? extends Number> next) {
        this.data=data;
        this.next=next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DataNode<? extends Number> getNext() {
        return next;
    }

    public void setNext(DataNode<? extends Number> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DataNode -> " + "data=" + data + ", NextNode -> " + next;
    }
}
