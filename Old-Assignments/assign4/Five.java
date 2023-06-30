// package assign4;

class Superclass {
    private int number;

    public Superclass(int number) {
        this.number = number;
        System.out.println("Superclass parameterized constructor called with number: " + number);
    }

    public void display() {
        System.out.println("Number in Superclass: " + number);
    }
}

class Subclass extends Superclass {
    private String text;

    public Subclass(int number, String text) {
        super(number); // Calls the parameterized constructor of the superclass
        this.text = text;
        System.out.println("Subclass parameterized constructor called with text: " + text);
    }

    public void display() {
        super.display(); // Calls the display() method of the superclass
        System.out.println("Text in Subclass: " + text);
    }
}

public class Five {
    public static void main(String[] args) {
        Subclass subclass = new Subclass(10, "Hello");
        subclass.display();
    }
}
