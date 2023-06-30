// package assignments.assign2;

/*Write a java program to find the Fibonacci series using recursive and non-
recursive functions. */

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Non-recursive function
        fiboNonRecursive(n);
        // Recursive function: returns teh nth fibonacci number, not upto nth fibonacci number
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            System.out.print(fiboRecursive(i)+" ");
        }
        sc.close();
    }
    private static int fiboRecursive(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        else {
            return fiboRecursive(n-1)+fiboRecursive(n-2);
        }
    }
    private static void fiboNonRecursive(int n) {
        int n1 = 0;
        int n2 = 1;
        
        System.out.print(n1+" "); 
        System.out.print(n2+" "); 

        for(int i = 2; i < n; i++)  {
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }
        System.out.println();
    }
}
