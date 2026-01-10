public class ConditionalStatements {

    public static void main(String[] args) {

        int number = 10;

        // 1️⃣ Simple if
        if (number > 0) {
            System.out.println("Number is positive");
        }

        // 2️⃣ if-else
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // 3️⃣ if-else-if ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // 4️⃣ Nested if
        int age = 20;
        boolean hasVoterID = true;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Voter ID required");
            }
        } else {
            System.out.println("Not eligible to vote");
        }

        // 5️⃣ Switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
