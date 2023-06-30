interface InnerInterface {
    void innerMethod();
}

interface OuterInterface {
    void outerMethod();

    // InnerInterface is defined inside the OuterInterface
    interface InnerInterface {
        void innerMethod();
    }
}

class MyClass implements OuterInterface.InnerInterface {
    @Override
    public void innerMethod() {
        System.out.println("Implementation of innerMethod");
    }
}

public class Six {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.innerMethod(); // Calls the implementation of innerMethod in MyClass
    }
}
