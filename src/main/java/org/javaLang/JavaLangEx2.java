package org.javaLang;

public class JavaLangEx2 {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createBeverage();
    }

}

class Beverage {
    public void toDrink() {
        System.out.println("마시자");
    }
}

class BeverageFactory {
    public Beverage createBeverage() {
        return new Beverage();
    }
}

class Coffee extends Beverage {
    public void addShot() {
        System.out.println("Add Shot");
    }
}

class CoffeeFactory extends BeverageFactory {
    @Override
    public Coffee createBeverage() {
        // 공변 반환 타입
        return new Coffee();
    }
}