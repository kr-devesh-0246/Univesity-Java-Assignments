// package assignments.assign2;
/*Write a java program that checks whether a given string is palindrome or
not. */

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int head = 0; int tail = str.length()-1;
        boolean flag = true;
        if(str.length() == 0){System.out.println("Not a palindrome"); System.exit(0);}
        while(head < tail) {
            if(str.charAt(head) != str.charAt(tail)) {flag = false; break;}
            head++;
            tail--;
        }
        if(flag == true){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        } 
    }
}
