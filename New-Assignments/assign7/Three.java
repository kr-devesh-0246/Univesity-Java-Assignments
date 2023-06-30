class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int calculate() {
        return value * value;
    }
}

public class Three {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(5);
        MyClass obj2 = new MyClass(7);
        MyClass obj3 = new MyClass(3);

        int result1 = obj1.calculate();
        int result2 = obj2.calculate();
        int result3 = obj3.calculate();

        System.out.println("Square of obj1: " + result1);
        System.out.println("Square of obj2: " + result2);
        System.out.println("Square of obj3: " + result3);
    }
}
