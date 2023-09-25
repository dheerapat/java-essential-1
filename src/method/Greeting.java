package method;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greetUser();
    }
    public static void greetUser() {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
