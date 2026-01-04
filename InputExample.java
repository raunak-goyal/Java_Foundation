import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Input an integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Input a double
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
