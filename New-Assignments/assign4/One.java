import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Employee " + i + " Details:");
            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Age: ");
            int age = input.nextInt();
            input.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Enter Designation: ");
            String designation = input.nextLine();

            System.out.print("Enter Salary: ");
            double salary = input.nextDouble();
            input.nextLine(); // Consume the newline character left by nextDouble()

            System.out.println("--------------------");

            System.out.println("Employee " + i + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);

            System.out.println("--------------------");
        }

        input.close();
    }
}
