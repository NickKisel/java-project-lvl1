package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int UPPER_LINE = 30;

    public static void gamePrime() {
        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] rightAnswers = new String[Engine.COUNT_OF_ROUNDS];
        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNumber = Utils.createRandomNumber(1, UPPER_LINE);

            questions[i] = Integer.toString(randomNumber);
            rightAnswers[i] = isPrime(randomNumber) ? "yes" : "no";
        }
        String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.gameBuild(gameTask, questions, rightAnswers);
    }

    public static boolean isPrime(int number) {
        int flagTwo = 2;
        int divider = 1 + flagTwo;
        while (divider < number || number < flagTwo) {
            if (number % divider == 0 || number % flagTwo == 0 || number < flagTwo) {
                return false;
            }
            divider += flagTwo;
        }
        return true;
    }
}
