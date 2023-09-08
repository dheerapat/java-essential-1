package decision_structure;

import java.util.Scanner;

public class QuotaChecker {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("How many sales did you make?");
        Scanner scanner = new Scanner(System.in);
        int sale = scanner.nextInt();

        scanner.close();

        if (sale >= quota) {
            System.out.println("Congrats!");
        }
        else {
            var saleShort = quota - sale;
            System.out.println("Keep up! you are " + saleShort + " sales behind target.");
        }
    }
}
