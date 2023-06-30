package assign4;

class Shape {
    // Superclass for square and rectangle
    // Contains common methods and fields

    protected double area;

    public void calculateArea() {
        // To be implemented by subclasses
    }
}

class Square extends Shape {
    // Subclass of Shape for square

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void calculateArea() {
        area = side * side;
    }
}

class Rectangle extends Shape {
    // Subclass of Shape for rectangle

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = length * width;
    }
}

public class One {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.calculateArea();
        System.out.println("Area of the square: " + square.area);

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + rectangle.area);
    }
}
