class Superclass {
    private int privateNumber;
    protected int protectedNumber;

    public Superclass(int privateNumber, int protectedNumber) {
        this.privateNumber = privateNumber;
        this.protectedNumber = protectedNumber;
    }

    private void privateMethod() {
        System.out.println("Private method in Superclass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in Superclass");
    }
}

class Subclass extends Superclass {
    public Subclass(int privateNumber, int protectedNumber) {
        super(privateNumber, protectedNumber);
    }

    public void accessMembers() {
        // privateNumber is not accessible in Subclass
        // privateMethod() is not accessible in Subclass

        System.out.println("protected Number in Subclass: " + protectedNumber);
        protectedMethod();
    }
}

public class Four {
    public static void main(String[] args) {
        Subclass subclass = new Subclass(10, 20);
        subclass.accessMembers();
    }
}
