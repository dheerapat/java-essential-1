package loop;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int runAgain;
        do {
            System.out.println("enter first number");
            double num1 = scanner.nextDouble();

            System.out.println("enter second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("the sum is: " + sum);

            System.out.println("want to run again? 1 for yes, 0 for no");
            runAgain = scanner.nextInt();
        } while (runAgain == 1);
    }
}
