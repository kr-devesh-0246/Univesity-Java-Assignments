class Superclass {
    public void calculate() {
        System.out.println("Calculate method in superclass");
    }
}

class Subclass extends Superclass {
    @Override
    public void calculate() {
        System.out.println("Calculate method in subclass");
    }
}

public class One {
    public static void main(String[] args) {
        Superclass obj1 = new Superclass();
        Superclass obj2 = new Subclass();

        obj1.calculate(); // Invokes calculate() method in Superclass
        obj2.calculate(); // Invokes calculate() method in Subclass
    }
}
