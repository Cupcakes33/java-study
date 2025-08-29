package org.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GenericsEx3 {
    static class Fruit {
        String name;
        int weight;

        Fruit(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return name+"("+weight+")";
        }
    }

    static class Apple extends Fruit {
        Apple(String name, int weight) {
            super(name, weight);
        }
    }

    static class Grape extends Fruit {
        Grape(String name, int weight) {
            super(name, weight);
        }
    }

    static class AppleComp implements Comparator<Apple> {
        @Override
        public int compare(Apple a1, Apple a2) {
            return a2.weight - a1.weight;
        }
    }

    static class GrapeComp implements Comparator<Grape> {
        @Override
        public int compare(Grape g1, Grape g2) {
            return g2.weight - g1.weight;
        }
    }

    static class FruitComp implements Comparator<Fruit> {
        @Override
        public int compare(Fruit f1, Fruit f2) {
            return f1.weight - f2.weight;
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

    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        appleBox.add(new Apple("apple", 300));
        appleBox.add(new Apple("apple", 100));
        appleBox.add(new Apple("apple", 200));

        grapeBox.add(new Grape("grape", 400));
        grapeBox.add(new Grape("grape", 300));
        grapeBox.add(new Grape("grape", 100));

        appleBox.getList().sort(new AppleComp());
        grapeBox.getList().sort(new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);

        appleBox.getList().sort(new FruitComp());
        grapeBox.getList().sort(new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
