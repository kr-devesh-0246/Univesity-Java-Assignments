interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();
}

class MyClass implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("Executing methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Executing methodB");
    }

    @Override
    public void methodC() {
        System.out.println("Executing methodC");
    }
}

public class Five {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
