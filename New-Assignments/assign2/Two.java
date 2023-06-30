public class Two {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three float numbers as command line arguments.");
            return;
        }

        // Parsing command line arguments
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);
        float num3 = Float.parseFloat(args[2]);

        // Finding the maximum number
        float max = Math.max(num1, Math.max(num2, num3));

        // Displaying the maximum number
        System.out.println("Maximum number: " + max);
    }
}
