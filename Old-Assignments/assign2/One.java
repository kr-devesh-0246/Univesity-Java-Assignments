package assignments.assign2;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for employee " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            System.out.print("Job Title: ");
            String jobTitle = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character

            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Job Title: " + jobTitle);
            System.out.println("Salary: " + salary);
            System.out.println();
        }

        scanner.close();
    }
}