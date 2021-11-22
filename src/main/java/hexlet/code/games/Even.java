package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void parityCheck() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int rightAnswer = 0;
        final int answersForWin = 3;
        Engine gameTwo = new Engine();
        for (int i = 0; i < answersForWin; i++) {
            int randomNumber = gameTwo.createRandomNumber();
            String question = Integer.toString(randomNumber);
            String answer = gameTwo.interactionWithUser(question);
            String value = getParity(randomNumber);

            rightAnswer = gameTwo.checkAnswer(value, answer, rightAnswer, nameOfUser);
            if (rightAnswer == -1) {
                break;
            }
        }
        if (rightAnswer == answersForWin) {
            gameTwo.congratulation(nameOfUser);
        }
    }

    private static String getParity(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
