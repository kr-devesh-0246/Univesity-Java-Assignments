class Superclass {
    String message = "Hello from superclass";

    void display() {
        System.out.println("Display method in superclass");
    }
}

class Subclass extends Superclass {
    String message = "Hello from subclass";

    void display() {
        System.out.println("Display method in subclass");
    }

    void accessMembers() {
        System.out.println("Accessing subclass members:");
        System.out.println("Message: " + message);
        display();
        System.out.println();
    }
}

public class Three {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.accessMembers();
        
        System.out.println("Accessing superclass members:");
        System.out.println("Message: " + subclass.message);
        subclass.display();
    }
}
