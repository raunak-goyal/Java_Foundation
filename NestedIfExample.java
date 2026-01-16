import java.util.Scanner;

public class NestedIfExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a voter ID? (true/false): ");
        boolean hasVoterID = sc.nextBoolean();

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible (No Voter ID).");
            }
        } else {
            System.out.println("You are underage.");
        }

        sc.close();
    }
}
