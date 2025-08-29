package org.generics;

import java.util.ArrayList;

public class GenericEx1 {
    static class Fruit {
        String name;
    }

    static class Apple extends Fruit {
        String name;
    }


    static class Box<T extends Fruit> {
        ArrayList<T> list = new ArrayList<>();

        void add(T item){list.add(item);}
        T get(int i){return list.get(i);}
        ArrayList<T> getList(){return list;}
        int size(){return list.size();}

        @Override
        public String toString() {
            return list.toString();
        }
    }

    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
//        Box<Apple> fruitBox = new Box<Fruit>();
//        Box<Frute> fruteBox2 = new Box<Apple>();
        fruitBox.add(new Apple());
        fruitBox.add(new Fruit());
        appleBox.add(new Apple());
//        AppleBox.add(new Fruit());
    }
}
