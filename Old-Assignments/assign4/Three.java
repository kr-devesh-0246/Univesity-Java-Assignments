// package assign4;

class Superclass {
    protected int num;

    public void display() {
        System.out.println("Superclass display()");
    }
}

class Subclass extends Superclass {
    private int num;

    public Subclass(int num) {
        this.num = num;
    }

    public void display() {
        System.out.println("Subclass display()");
    }

    public void accessMembers() {
        System.out.println("Accessing subclass members:");
        System.out.println("Subclass num: " + num);
        display();
    }
}

public class Three {
    public static void main(String[] args) {
        Subclass subclass = new Subclass(10);
        subclass.accessMembers();
    }
}
