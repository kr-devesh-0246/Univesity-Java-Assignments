abstract class MyClass {
    public abstract void abstractMethod();
}

class Subclass1 extends MyClass {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstractMethod in Subclass1");
    }
}

class Subclass2 extends MyClass {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstractMethod in Subclass2");
    }
}

public class Four {
    public static void main(String[] args) {
        MyClass obj1 = new Subclass1();
        obj1.abstractMethod(); // Calls abstractMethod implementation in Subclass1

        MyClass obj2 = new Subclass2();
        obj2.abstractMethod(); // Calls abstractMethod implementation in Subclass2
    }
}
