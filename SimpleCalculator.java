import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result: " + (a + b));
        } else if (op == '-') {
            System.out.println("Result: " + (a - b));
        } else if (op == '*') {
            System.out.println("Result: " + (a * b));
        } else if (op == '/') {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Division by zero not allowed");
            }
        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
