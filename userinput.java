import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking float input
        System.out.print("Enter your CGPA: ");
        float cgpa = sc.nextFloat();

        // Clearing buffer
        sc.nextLine();

        // Taking string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Output
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        sc.close();
    }
}
