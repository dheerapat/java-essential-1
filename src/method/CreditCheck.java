package method;

import java.util.Scanner;

public class CreditCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();

        scanner.close();

        boolean qualify = isUserQualified(creditScore, salary);
        notifyUser(qualify);
    }

    public static boolean isUserQualified(int creditScore, Double salary) {
        double requireSalary = 25000;
        int requireCreditScore = 700;

        if (creditScore >= requireCreditScore && salary >= requireSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualify) {
        if (isQualify) {
            System.out.println("Congrats!!");
        } else {
            System.out.println("Sorry");
        }
    }
}
