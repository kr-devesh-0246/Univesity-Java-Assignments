// package assignments.assign2;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        // factorial(n) =  n*(n-1)*(n-2)...*(2)*(1)
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0) {System.out.println("Factorial value: " + "1");}
        int result = 1;
        for(int i = n; i >= 1; i--) {
            result *= i;
        }
        System.out.println("Factorial value: " + result);

        sc.close();
    }    
}
