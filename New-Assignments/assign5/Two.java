public class Two {
    public static void main(String[] args) {
        Two example = new Two();

        // Calling the overloaded methods
        example.display();
        example.display(10);
        example.display("Hello");
        example.display(5, 7);
        example.display(2.5, 3.8);
    }

    // Method with no arguments
    public void display() {
        System.out.println("No arguments");
    }

    // Method with an integer argument
    public void display(int num) {
        System.out.println("Integer argument: " + num);
    }

    // Method with a string argument
    public void display(String str) {
        System.out.println("String argument: " + str);
    }

    // Method with two integer arguments
    public void display(int num1, int num2) {
        System.out.println("Two integer arguments: " + num1 + ", " + num2);
    }

    // Method with two double arguments
    public void display(double num1, double num2) {
        System.out.println("Two double arguments: " + num1 + ", " + num2);
    }
}
