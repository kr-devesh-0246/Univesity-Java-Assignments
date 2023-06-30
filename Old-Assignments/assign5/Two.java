class Sample {
    public void printMessage() {
        System.out.println("Printing a default message");
    }

    public void printMessage(String message) {
        System.out.println("Printing message: " + message);
    }
}

public class Two {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.printMessage();                    // Calls printMessage() without arguments
        sample.printMessage("Hello, World!");     // Calls printMessage() with a String argument
    }
}
