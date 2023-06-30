class Superclass {
    private int privateNumber = 10;
    protected int protectedNumber = 20;

    private void privateMethod() {
        System.out.println("This is a private method in superclass");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method in superclass");
    }
}

class Subclass extends Superclass {
    void accessMembers() {
        // Accessing private members - Not allowed
        // System.out.println("Private number: " + privateNumber);
        // privateMethod();

        // Accessing protected members - Allowed
        System.out.println("Protected number: " + protectedNumber);
        protectedMethod();
    }
}

public class Four {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.accessMembers();
    }
}
