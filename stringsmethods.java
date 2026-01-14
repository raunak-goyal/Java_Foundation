public class StringMethods {

    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println("Original String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 2: " + text.charAt(2));
        System.out.println("Substring (0 to 4): " + text.substring(0, 4));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // Replace example
        System.out.println("Replace 'Java' with 'Python': " +
                text.replace("Java", "Python"));
    }
}
