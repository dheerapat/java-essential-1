package loop;

import java.util.Random;

public class RollTheDie {
    public static void main(String[] args) {
        int round = 1;
        int space = 20;
        int currentSpace = 0;
        Random random = new Random();

        while (round <= 5) {
            int die = random.nextInt(6) + 1;
            currentSpace += die;
            space -= die;

            if (currentSpace == 20 && round == 5) {
                System.out.println("Roll #" + round + ": you got " + die + ". You are now on space " + currentSpace + " , You won.");
            } else if (round == 5 && currentSpace < 20) {
                System.out.println("Game Over");
            } else if (currentSpace > 20) {
                System.out.println("Game Over");
                break;
            } else {
                System.out.println(
                        "Roll #" + round + ": you got " + die + ". You are now on space " +
                                currentSpace + " , " + space + " more to go.");
            }

            round++;
        }
    }

}
