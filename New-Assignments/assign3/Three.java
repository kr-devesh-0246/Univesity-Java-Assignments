public class Three {
    public static void main(String[] args) {
        String originalString = "Hello";
        String copiedString = createCopies(originalString);

        System.out.println("Copied string: " + copiedString);
    }

    public static String createCopies(String str) {
        if (str.length() < 2) {
            return str;  // If the string has less than 2 characters, return the original string
        }

        String firstTwoChars = str.substring(0, 2);  // Extract the first two characters

        StringBuilder copiedString = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            copiedString.append(firstTwoChars);  // Append the first two characters 'n' times
        }

        return copiedString.toString();
    }
}
