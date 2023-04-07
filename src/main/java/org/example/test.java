package org.example;

public class test <T>{
        private T t;
        public void set(T t) {
            this.t = t;
        }
        public T get() {
            return t;
        }
        public <U extends Number> void check(U u) {
            System.out.println("T: " + t.getClass().getName());
            System.out.println("U: " + u.getClass().getName());
        }
        public static void main(String[] args) {
            test<Integer> demo = new test<>();
            demo.set(5);
            demo.check((10));
        }
    }
