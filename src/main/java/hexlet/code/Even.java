package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void parityCheck(Even even) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner nameAsk = new Scanner(System.in);
        String nameOfUser = nameAsk.nextLine();
        System.out.println("Hello, " + nameOfUser + "!");

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int rightAnswer = 0;
        final int answersForWin = 3;
        final int lowerLine = 1;
        final int upperLine = 30;
        Scanner scanner = new Scanner(System.in);
        while (rightAnswer < answersForWin) {
            int randomNumber = (int) (lowerLine + Math.random() * upperLine);
            System.out.println("Question: " + randomNumber);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            if (randomNumber % 2 == 0 && "yes".equals(answer) || randomNumber % 2 != 0 && "no".equals(answer)) {
                System.out.println("Correct!");
                rightAnswer++;
            } else if (randomNumber % 2 != 0 && !"no".equals(answer)
                    || randomNumber % 2 == 0 && !"yes".equals(answer)) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + nameOfUser + "!");
            }
        }
        System.out.println("Congratulations, " + nameOfUser + "!");
    }
}
