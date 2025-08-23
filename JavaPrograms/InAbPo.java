// Main class
public class InAbPo {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Use the draw() and calculateArea() methods
        circle.draw();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.draw();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}

// Abstract class Shape
abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

// Concrete class Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing a circle");
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void draw() {
        System.out.println("Drawing a rectangle");
    }

    double calculateArea() {
        return length * width;
    }
}

