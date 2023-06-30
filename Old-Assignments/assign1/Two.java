package assignments.assign1;

import java.util.Scanner;

// basic calculator
public class Two {
    public static void main(String[] args) {
        int n1=0,n2=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n1: ");
        n1 = s.nextInt();
        System.out.print("Enter n2: ");
        n2 = s.nextInt();
        int sum = n1+n2;
        int dif = n1-n2;
        int mul = n1*n2;
        int div = n1/n2;
        // outputs
        System.out.println("Sum: "+ sum);
        System.out.println("Dif: "+ dif);
        System.out.println("Mul: "+ mul);
        System.out.println("Div: "+ div);
        s.close();

    }
}
