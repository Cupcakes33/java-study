package org.generics;

import java.util.ArrayList;

public class GenericsEx2 {
    static class Fruit {
        @Override
        public String toString() {
            return "Fruit";
        }
    }
    static class Apple extends Fruit {
        @Override
        public String toString() {
            return "Apple";
        }
    }
    static class Grape extends Fruit {
        @Override
        public String toString() {
            return "Grape";
        }
    }

    static class Juice {
        String name;
        Juice(String name){this.name = name + "Juice";}

        @Override
        public String toString() {
            return this.name;
        }
    }

    static class FruitBox<T extends Fruit> extends Box<T> {}
    static class Box<T> {
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


    static class Juicer {
        static Juice makeJuice(FruitBox<? extends Fruit> box){
            StringBuilder tmp = new StringBuilder();
            for(Fruit fruit : box.getList()){
                tmp.append(fruit.toString());
            }

            return new Juice(tmp.toString());
        }
    }

    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}
