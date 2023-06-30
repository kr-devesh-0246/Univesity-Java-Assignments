public class Five {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            int result = numbers[4]; // Accessing an out-of-bounds index
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred!");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception occurred!");
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }
    }
}
