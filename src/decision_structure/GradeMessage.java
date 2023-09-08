package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void  main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // switch expression
        String message = switch (grade) {
            case "A", "B" -> "Nice";
            case "C" -> "Not bad";
            case "D" -> "Keep up!";
            case "F" -> "Don't give up";
            default -> "Error";
        };

        // original switch

//        switch (grade) {
//            // fall through
//            case "A":
//            case "B":
//                message = "Nice";
//                break;
//            case "C":
//                message = "Not bad";
//                break;
//            case "D":
//                message = "Keep up!";
//                break;
//            case "F":
//                message = "Don't give up";
//                break;
//            default:
//                message = "Error";
//                break;
//        }

        System.out.println(message);
    }
}
