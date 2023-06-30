public class Five {
    public static void main(String[] args) {
        String input = "TomCat";
        String result = getFirstHalfString(input);

        System.out.println("First half of the string: " + result);
    }

    public static String getFirstHalfString(String str) {
        int length = str.length();

        if (length % 2 != 0) {
            return null;  // Return null for odd-length strings
        }

        return str.substring(0, length / 2);
    }
}
