package main.java.org.collections;

import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        set("1");
        set("2");
        set("3");
        set("4");

        printStatus();

        goBack();
        printStatus();

        goBack();
        printStatus();

        goForward();
        printStatus();

        set("5");
        printStatus();
    }

    public static void set(String str){
        back.push(str);
        if(!forward.empty()) forward.clear();
        System.out.println(str + " set");
    }

    public static void goBack(){
        if(!back.empty()){ // back 스택이 비어있지 않아야 뒤로 갈 수 있음
            forward.push(back.pop()); // back에서 꺼내서 forward로 옮김
            System.out.println("뒤로 가기");
        } else {
            System.out.println("뒤로 갈 페이지가 없습니다.");
        }
    }
    public static void goForward(){
        if(!forward.empty()){ // forward 스택이 비어있지 않아야 앞으로 갈 수 있음
            back.push(forward.pop()); // forward에서 꺼내서 back으로 옮김
            System.out.println("앞으로 가기");
        } else {
            System.out.println("앞으로 갈 페이지가 없습니다.");
        }
    }
    public static void printStatus(){
        System.out.println("back : " + back);
        System.out.println("forward : " + forward);
    }

}
