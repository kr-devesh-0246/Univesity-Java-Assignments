public class Two {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a forced exception");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
