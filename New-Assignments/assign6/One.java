// I had to change all the ShapeTests with One

class Shape {
    // Superclass Shape
    // Empty implementation for the calculateArea() method
    public double calculateArea() {
        return 0.0;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Overriding the calculateArea() method for Square
    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea() method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class One {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        System.out.println("Area of Square: " + square.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
