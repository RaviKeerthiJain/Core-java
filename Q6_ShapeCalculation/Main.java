import java.util.Scanner;

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) { this.radius = radius; }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        Shape c = new Circle(sc.nextDouble());

        System.out.print("Enter length and width of rectangle: ");
        Shape r = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter base and height of triangle: ");
        Shape t = new Triangle(sc.nextDouble(), sc.nextDouble());

        System.out.printf("Circle area    : %.2f%n", c.calculateArea());
        System.out.printf("Rectangle area : %.2f%n", r.calculateArea());
        System.out.printf("Triangle area  : %.2f%n", t.calculateArea());

        sc.close();
    }
}
