public class StringBasics {

    public static void main(String[] args) {

        // String literal
        String name = "Raunak";

        // String object using new keyword
        String college = new String("UPES");

        // Printing strings
        System.out.println("Name: " + name);
        System.out.println("College: " + college);

        // String concatenation
        String fullInfo = name + " studies at " + college;
        System.out.println("Info: " + fullInfo);

        // Length of string
        System.out.println("Length of name: " + name.length());
    }
}
