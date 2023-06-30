import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }

        long factorial = 1;
        
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
