import java.util.Scanner;

public class Five {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                                          "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(numberToWord(num));

        scanner.close();
    }

    public static String numberToWord(int num) {
        if (num == 0) {
            return "zero";
        }

        if (num < 0) {
            return "minus " + numberToWord(-num);
        }

        if (num < 20) {
            return ones[num];
        }

        if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? " " : "") + ones[num % 10];
        }

        if (num < 1000) {
            return ones[num / 100] + " hundred" + ((num % 100 != 0) ? " and " : "") + numberToWord(num % 100);
        }

        if (num < 1000000) {
            return numberToWord(num / 1000) + " thousand" + ((num % 1000 != 0) ? " " : "") + numberToWord(num % 1000);
        }

        return "number too large";
    }
}
