package org.example.lec1;
interface IBase<T>{}
public interface IData<T> extends IBase<T>{
    public T getData();

    public void setData(T data);
}
