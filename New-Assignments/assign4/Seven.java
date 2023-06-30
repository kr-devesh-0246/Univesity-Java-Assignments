public class Seven {
    public static void main(String[] args) {
        int number = 1;
        int rows = 7; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
