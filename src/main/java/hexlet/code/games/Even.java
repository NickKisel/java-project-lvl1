package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void parityCheck() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int rightAnswer = 0;
        final int answersForWin = 3;
        Scanner scanner = new Scanner(System.in);
        Engine gameTwo = new Engine();
        for (int i = 0; i < answersForWin; i++) {
            int randomNumber = gameTwo.createRandomNumber();
            gameTwo.getQuestion(Integer.toString(randomNumber));
            String answer = scanner.nextLine();
            gameTwo.getAnswer(answer);
            String value = yesOrNo(randomNumber);

            rightAnswer = gameTwo.checkAnswer(value, answer, rightAnswer, nameOfUser);
            if (rightAnswer == -1) {
                break;
            }
        }
        if (rightAnswer == answersForWin) {
            gameTwo.congratulation(nameOfUser);
        }
    }

    private static String yesOrNo(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
