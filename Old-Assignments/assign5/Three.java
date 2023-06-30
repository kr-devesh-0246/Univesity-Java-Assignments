class MyClass {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int calculate() {
        return number * number;
    }
}

public class Three {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.setNumber(5);
        int result1 = obj1.calculate();
        System.out.println("Square value of obj1: " + result1);

        MyClass obj2 = new MyClass();
        obj2.setNumber(7);
        int result2 = obj2.calculate();
        System.out.println("Square value of obj2: " + result2);
    }
}
