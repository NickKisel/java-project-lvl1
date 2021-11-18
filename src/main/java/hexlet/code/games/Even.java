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
        while (rightAnswer < answersForWin) {
            int randomNumber = gameTwo.createRandomNumber();
            System.out.println("Question: " + randomNumber);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            String value = yesOrNo(randomNumber);
            rightAnswer = gameTwo.checkAnswer(value, answer, rightAnswer, nameOfUser);
        }
        System.out.println("Congratulations, " + nameOfUser + "!");
    }

    public static String yesOrNo(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
