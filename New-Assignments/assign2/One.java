public class One {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three integers as command line arguments.");
            return;
        }

        // Parsing command line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        // Calculating sum
        int sum = num1 + num2 + num3;

        // Calculating average
        double average = (double) sum / 3;

        // Displaying the result
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
