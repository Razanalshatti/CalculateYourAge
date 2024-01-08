import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Initialize the Scanner for User Input
        Scanner scanner = new Scanner(System.in);

        // ask user to enter Birth Date
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth day of the month: ");
        int birthDay = scanner.nextInt();

        // Retrieve the Current Date
        Calendar currentDate = Calendar.getInstance();

        // Set User's Birth Date in Calendar
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(birthYear, birthMonth - 1, birthDay); // Adjust month (zero-indexed)

        // Calculate the Age
        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        // Adjust the age if the current date is before the user's birthday in the current year
        if (currentDate.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        // Display the Calculated Age
        System.out.println("Your age is: " + age + " years");

        // Close the Scanner
        scanner.close();
    }
}