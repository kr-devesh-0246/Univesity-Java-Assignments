abstract class MyClass {
    public abstract void performAction();
}

class SubClass1 extends MyClass {
    @Override
    public void performAction() {
        System.out.println("Performing action in SubClass1");
    }
}

class SubClass2 extends MyClass {
    @Override
    public void performAction() {
        System.out.println("Performing action in SubClass2");
    }
}

public class Four {
    public static void main(String[] args) {
        MyClass obj1 = new SubClass1();
        MyClass obj2 = new SubClass2();

        obj1.performAction(); // Invokes performAction() of SubClass1
        obj2.performAction(); // Invokes performAction() of SubClass2
    }
}
