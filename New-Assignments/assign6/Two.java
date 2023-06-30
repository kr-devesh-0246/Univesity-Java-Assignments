class Superclass {
    public Superclass() {
        System.out.println("Superclass default constructor");
    }
}

class Subclass extends Superclass {
    public Subclass() {
        System.out.println("Subclass default constructor");
    }
}

public class Two {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
    }
}
