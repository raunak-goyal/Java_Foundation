class Literals {
    public static void main(String[] args) {
// 1️⃣ Integer Literals
        int decimal = 100;
        int binary = 0b1010;     // binary literal
        int octal = 012;         // octal literal
        int hexadecimal = 0x64;  // hexadecimal literal

        // 2️⃣ Floating-point Literals
        float floatValue = 10.5f;
        double doubleValue = 99.99;

        // 3️⃣ Character Literals
        char letter = 'A';
        char unicodeChar = '\u0041'; // Unicode for 'A'

        // 4️⃣ String Literal
        String message = "Hello Java Literals";

        // 5️⃣ Boolean Literals
        boolean isJavaFun = true;
        boolean isHard = false;

        // 6️⃣ Null Literal
        String emptyValue = null;

        // Output
        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        System.out.println("\nFloating-point Literals:");
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        System.out.println("\nCharacter Literals:");
        System.out.println("Char: " + letter);
        System.out.println("Unicode Char: " + unicodeChar);

        System.out.println("\nString Literal:");
        System.out.println(message);

        System.out.println("\nBoolean Literals:");
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("isHard: " + isHard);

        System.out.println("\nNull Literal:");
        System.out.println(emptyValue);
    }
}
