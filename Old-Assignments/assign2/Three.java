// package assignments.assign2;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(isPrime(n) == true){System.out.println("Prime");}
        else {System.out.println("Not a prime number");}
    }
    public static boolean isPrime(int n) {
        // this algorithm is three times as fast as the i <= root(n) method
        if(n == 1) return false;
        if(n == 2 || n == 3) { 
            return true;
        }
        if(n%2 == 0 || n%3 == 0) {
            return false;
        }
        for(int i = 5; i*i <= n; i +=6 ) {
            if(n%i == 0 || n%(i+2) == 0) {
                return false;
            }
        }
        return true;
    }
}
