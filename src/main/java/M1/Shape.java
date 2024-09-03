package M1;

public abstract class Shape {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea(); // 抽象方法，計算面積

    public void display() {
        System.out.println("形狀顏色: " + color);
        System.out.println("面積: " + getArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI* radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}