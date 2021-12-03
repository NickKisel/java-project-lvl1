package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int UPPER_LINE = 30;

    public static void gameGCD() {
        String[] questions = new String[Engine.CORRECT];
        String[] rightAnswers = new String[Engine.CORRECT];

        for (int i = 0; i < Engine.CORRECT; i++) {
            int firstRandomNumber = Utils.createRandomNumber(1, UPPER_LINE);
            int secondRandomNumber = Utils.createRandomNumber(1, UPPER_LINE);

            questions[i] = firstRandomNumber + " " + secondRandomNumber;
            rightAnswers[i] = Integer.toString(getGCD(firstRandomNumber, secondRandomNumber));
        }
        String gameTask = "Find the greatest common divisor of given numbers.";
        Engine.gameBuild(gameTask, questions, rightAnswers);
    }

    private static int getGCD(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        int first = getGreaterNumber(numberOne, numberTwo);
        int second = sum - first;
        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }

    private static int getGreaterNumber(int first, int second) {
        int greater = 0;
        if (first > second) {
            greater = first;
        } else {
            greater = second;
        }
        return greater;
    }
}
