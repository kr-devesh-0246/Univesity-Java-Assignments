// I had to replace all MyClass with Five

public class Five {
    private int instanceVariable;

    public 
    static void staticMethod(Five myObject) {
        int value = myObject.instanceVariable;
        System.out.println("Value of instanceVariable: " + value);
    }

    public static void main(String[] 
    args) {
        Five 
        myObject = new Five();
        myObject.instanceVariable = 42;

        staticMethod(myObject);
    }
}
