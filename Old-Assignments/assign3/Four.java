public class Four {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int sum = Four.sum(x, y);
        System.out.println("Sum of " + x + " and " + y + " is " + sum);
    }
}
