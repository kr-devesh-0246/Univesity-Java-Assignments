public class Five {
    private int x; // instance variable

    public static void main(String[] args) {
        Five obj = new Five();
        obj.x = 10; // access instance variable using object
        display(obj.x); // pass instance variable to static method
    }

    public static void display(int x) {
        System.out.println("Value of x = " + x);
    }
}
