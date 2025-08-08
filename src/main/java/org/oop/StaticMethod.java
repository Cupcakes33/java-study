package org.oop;

public class StaticMethod {
    private String name = "Instance Variable";
    private static String staticName = "Static Variable";

    // 인스턴스 메서드
    public void instanceMethod1() {
        System.out.println("instanceMethod1 호출됨");

        // 같은 클래스의 다른 인스턴스 메서드 호출 가능 (참조변수 없이)
        instanceMethod2();

        // 인스턴스 변수 접근 가능
        System.out.println("인스턴스 변수: " + name);
    }

    public void instanceMethod2() {
        System.out.println("instanceMethod2 호출됨");

        // 같은 클래스의 static 메서드 호출 가능
        staticMethod();
    }

    // static 메서드
    public static void staticMethod() {
        System.out.println("staticMethod 호출됨");

        // ❌ 컴파일 에러! static 메서드에서 인스턴스 메서드 직접 호출 불가
        // instanceMethod1(); // 에러!
        // instanceMethod2(); // 에러!

        // ❌ 컴파일 에러! static 메서드에서 인스턴스 변수 직접 접근 불가
        // System.out.println(name); // 에러!

        // ✅ static 변수 접근 가능
        System.out.println("static 변수: " + staticName);
    }

    public static void main(String[] args) {
        System.out.println("=== 인스턴스 메서드에서의 호출 ===");
        StaticMethod instance = new StaticMethod();
        instance.instanceMethod1();

        System.out.println("\n=== static 메서드만 호출 ===");
        staticMethod();
    }
}