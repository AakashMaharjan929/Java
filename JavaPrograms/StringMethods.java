public class StringMethods {
    public static void main(String[] args) {
        // Creating strings in various ways
        String str1 = "Hello, World!";
        String str2 = new String("Java");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        
        // String methods
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 7 in str1: " + str1.charAt(7));
        System.out.println("Index of 'W' in str1: " + str1.indexOf('W'));
        System.out.println("Substring from index 7 to 12 in str1: " + str1.substring(7, 12));
        System.out.println("Concatenation of str1 and str2: " + str1.concat(str2));
        System.out.println("Replacing 'World' with 'Universe' in str1: " + str1.replace("World", "Universe"));
        System.out.println("Converting str1 to lowercase: " + str1.toLowerCase());
        System.out.println("Converting str2 to uppercase: " + str2.toUpperCase());
        System.out.println("Checking if str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("Checking if str2 ends with 'va': " + str2.endsWith("va"));
    }
}