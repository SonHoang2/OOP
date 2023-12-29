abstract class Shape {
    public abstract double getArea();
}

class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (height * base) / 2;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * pi;
    }
}

public class bai1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(3, 5);
        shapes[1] = new Rectangle(3, 5);
        shapes[2] = new Circle(3);

        System.out.println("dien tich hinh tam giac: " + shapes[0].getArea());
        System.out.println("dien tich hinh chu nhat: " + shapes[1].getArea());
        System.out.println("dien tich hinh tron: " + shapes[2].getArea());
    }
}