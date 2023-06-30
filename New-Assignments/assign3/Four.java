public class Four {
    public static void main(String[] args) {
        String input = "Suman";
        String result = removeFirstAndLastCharacter(input);

        System.out.println("Modified string: " + result);
    }

    public static String removeFirstAndLastCharacter(String str) {
        if (str.length() <= 2) {
            return "";  // If the string has 2 or fewer characters, return an empty string
        }

        return str.substring(1, str.length() - 1);
    }
}
