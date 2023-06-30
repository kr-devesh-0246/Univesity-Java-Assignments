class Superclass {
    private int value;

    public Superclass(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value in superclass: " + value);
    }
}

class Subclass extends Superclass {
    public Subclass(int value) {
        super(value);  // Calling superclass parameterized constructor
    }
}

public class Five {
    public static void main(String[] args) {
        Subclass subclass = new Subclass(10);
        subclass.display();
    }
}
