// package assign5;

class Superclass {
    public void calculate() {
        System.out.println("Calculate method in Superclass");
    }
}

class Subclass extends Superclass {
    public void calculate() {
        System.out.println("Calculate method in Subclass");
    }
}

public class One {
    public static void main(String[] args) {
        Superclass superclass = new Superclass();
        Subclass subclass = new Subclass();

        superclass.calculate(); // Calls calculate() method of Superclass
        subclass.calculate();   // Calls calculate() method of Subclass

        Superclass dynamicDispatch = new Subclass();
        dynamicDispatch.calculate(); // Calls calculate() method of Subclass
    }
}
