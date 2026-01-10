public class JavaOperators {

    public static void main(String[] args) {

        int a = 10, b = 5;

        // 1️⃣ Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2️⃣ Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 3️⃣ Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // 4️⃣ Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5;
        System.out.println("c += 5 → " + c);
        c -= 3;
        System.out.println("c -= 3 → " + c);
        c *= 2;
        System.out.println("c *= 2 → " + c);
        c /= 4;
        System.out.println("c /= 4 → " + c);

        // 5️⃣ Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d++ = " + d++);
        System.out.println("++d = " + ++d);
        System.out.println("d-- = " + d--);
        System.out.println("--d = " + --d);

        // 6️⃣ Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b is: " + max);

        // 7️⃣ Bitwise Operators
        int p = 5, q = 3;
        System.out.println("\nBitwise Operators:");
        System.out.p rintln("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
    }
    }
