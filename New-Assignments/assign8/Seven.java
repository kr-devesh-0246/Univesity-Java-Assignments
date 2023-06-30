public class Seven {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
