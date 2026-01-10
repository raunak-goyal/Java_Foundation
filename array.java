import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args) {

        // ---------- ARRAY DECLARATION & INITIALIZATION ----------
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        // ---------- SUM OF ARRAY ELEMENTS ----------
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);

        // ---------- MAX ELEMENT IN ARRAY ----------
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);

        // ---------- REVERSE ARRAY ----------
        System.out.println("Reversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        // ---------- USER INPUT ARRAY ----------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
