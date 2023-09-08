package game;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of penny");
        int numPennies = scanner.nextInt();

        System.out.println("Enter number of nickel");
        int numNickels = scanner.nextInt();

        System.out.println("Enter number of dime");
        int numDimes = scanner.nextInt();

        System.out.println("Enter number of quarter");
        int numQuarters = scanner.nextInt();

        scanner.close();

        var total = (numDimes * dime) + (numPennies * penny) + (numNickels * nickel) + (numQuarters * quarter);

        if (total == dollar) {
            System.out.println("You win!");
        } else {
            var off = Math.abs(total - dollar);
            System.out.println("Sorry you are off by $" + String.format("%.2f", off));
        }
    }
}
