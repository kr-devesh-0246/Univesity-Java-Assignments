public class One {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            int result = numbers[4]; // Trying to access an invalid index
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index out of bounds exception!");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception!");
        } catch (Exception ex) {
            System.out.println("General exception!");
        }
    }
}
