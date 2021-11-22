package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    public static void gamePrime() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int rightAnswer = 0;
        final int answersForWin = 3;
        Engine gameSix = new Engine();
        for (int i = 0; i < answersForWin; i++) {
            int randomNumber = gameSix.createRandomNumber();

            String question = Integer.toString(randomNumber);
            String answer = gameSix.interactionWithUser(question);
            String value = getPrime(randomNumber);

            rightAnswer = gameSix.checkAnswer(value, answer, rightAnswer, nameOfUser);
            if (rightAnswer == -1) {
                break;
            }
        }
        if (rightAnswer == answersForWin) {
            gameSix.congratulation(nameOfUser);
        }
    }

    public static String getPrime(int number) {
        int flagTwo = 2;
        int divider = 1 + flagTwo;
        while (divider < number || number < flagTwo) {
            if (number % divider == 0 || number % flagTwo == 0 || number < flagTwo) {
                return "no";
            }
            divider += flagTwo;
        }
        return "yes";
    }
}
