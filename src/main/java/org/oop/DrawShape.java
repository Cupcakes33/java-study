package org.oop;

public class DrawShape {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(2,2);
        Point point3 = new Point(3,3);
        Point[]  points = {point1, point2, point3};
        Triangle triangle = new Triangle(points);
        triangle.draw();
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color = %s]%n", color);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getPoint() {
        return String.format("[x=%d, y=%d]", x, y);
    }

    void showPoint() {
        System.out.printf("[x=%d, y=%d]%n", x, y);
    }
}

class Circle extends Shape {
    Point center;
    int r;

    Circle() {
        this(new Point(0,0), 100);
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    @Override
    void draw() {
        System.out.printf("[center = (%d, %d), r = %d, color=%s]%n]", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }

    @Override
    void draw() {
        System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color=%s]%n", p[0].getPoint(), p[1].getPoint(), p[2].getPoint(), color);
    }
}