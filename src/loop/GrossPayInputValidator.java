package loop;

import java.util.Scanner;

public class GrossPayInputValidator {
    public static void main(String[] args) {
        int payRate = 15;
        int maxHours = 40;

        // get user input
        System.out.println("How many hours did the employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double hourWorked = scanner.nextDouble();

        // validate input
        while(hourWorked > maxHours) {
            System.out.println("Invalid input");
            hourWorked = scanner.nextDouble();
        }

        scanner.close();

        // calculate gross pay
        double gross = payRate * hourWorked;
        System.out.println("Gross pay: " + gross);
    }
}
