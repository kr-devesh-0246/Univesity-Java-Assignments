package assign4;

class Superclass {
    public Superclass() {
        System.out.println("Superclass default constructor called");
    }
}

class Subclass extends Superclass {
    public Subclass() {
        super(); // Calls the default constructor of the superclass
        System.out.println("Subclass default constructor called");
    }
}

public class Two {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
    }
}
