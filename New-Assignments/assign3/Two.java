public class Two {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World";

        String concatenatedString = concatenateAndConvertToLowercase(str1, str2);

        System.out.println("Concatenated string in lowercase: " + concatenatedString);
    }

    public static String concatenateAndConvertToLowercase(String str1, String str2) {
        String concatenatedString = str1.concat(str2);
        return concatenatedString.toLowerCase();
    }
}
