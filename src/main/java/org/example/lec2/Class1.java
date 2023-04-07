package org.example.lec2;
interface Iinterface<T>{} //generic interface
interface Iinterface2{} //non-generic interface

//Generic class implementing generic interface
public class Class1<T> implements Iinterface {
}

//Generic class implementing non-generic interface
class Class2<T> implements Iinterface2{
}

// ERROR: normal class extending a generic interface
//class Class3 implements Iinterface<T> {
//
//}

// NO ERROR: as we specified the exact type
//class Class4 implements Iinterface<String> {
//
//}

//ERROR: Because of type mismatch
//class Class5<T> extends Class1<T> implements Iinterface<Integer>{
//
//}