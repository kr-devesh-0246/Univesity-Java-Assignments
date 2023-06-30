import java.util.Scanner;

public class Five {
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (up to 999): ");
        int number = input.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Invalid input. Please enter a number between 0 and 999.");
        } else {
            String word = convertNumberToWord(number);
            System.out.println("Number in words: " + word);
        }
    }

    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "zero";
        }

        String word = "";

        if (number / 100 > 0) {
            word += units[number / 100] + " hundred ";
            number %= 100;
        }

        if (number / 10 > 0) {
            if (number / 10 == 1) {
                word += units[number];
                number = 0;
            } else {
                word += tens[number / 10] + " ";
                number %= 10;
            }
        }

        if (number > 0) {
            word += units[number];
        }

        return word.trim();
    }
}
