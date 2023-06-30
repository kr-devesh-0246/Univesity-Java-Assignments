// package assignments.assign1;
import java.util.Scanner;
/*WAP to print ASCII value of numbers, characters. */
public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ascii = n+48; 
        System.out.print("Enter a Character: ");
        String str = sc.next();
        char c = str.charAt(0);
        System.out.printf("ASCII of number %d is %d\n", n, ascii);
        System.out.printf("ASCII of char %c is %d\n", c, (int) c);
        sc.close();
    }
}
