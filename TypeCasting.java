public class TypeCasting {

    public static void main(String[] args) {


        int intValue = 100;
        double doubleValue = intValue;

        System.out.println("Implicit Casting:");
        System.out.println("Int value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        double price = 99.99;
        int roundedPrice = (int) price; 

        System.out.println("\nExplicit Casting:");
        System.out.println("Double price: " + price);
        System.out.println("Int price: " + roundedPrice);

        
        char grade = 'A';
        int asciiValue = grade;

        System.out.println("\nChar to Int Casting:");
        System.out.println("Character: " + grade);
        System.out.println("ASCII Value: " + asciiValue);
    }
}
