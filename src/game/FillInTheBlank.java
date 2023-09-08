package game;

import java.util.Scanner;

public class FillInTheBlank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's create the story!");

        System.out.println("Enter some adjective");
        String adj = scanner.next();

        System.out.println("Enter season of the year");
        String season = scanner.next();

        System.out.println("Enter a whole number");
        int num = scanner.nextInt();

        scanner.close();

        System.out.println("On a(n) " + adj + " " + season + " day, I drink " + num + " cup of coffee.");
    }
}
