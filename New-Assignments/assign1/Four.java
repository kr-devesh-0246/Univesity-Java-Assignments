import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                double circleArea = calculateCircleArea(radius);
                double circlePerimeter = calculateCirclePerimeter(radius);
                System.out.println("Area of the circle: " + circleArea);
                System.out.println("Perimeter of the circle: " + circlePerimeter);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = input.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = input.nextDouble();
                double rectangleArea = calculateRectangleArea(length, width);
                double rectanglePerimeter = calculateRectanglePerimeter(length, width);
                System.out.println("Area of the rectangle: " + rectangleArea);
                System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
