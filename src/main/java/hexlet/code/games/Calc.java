package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {
    private static final int UPPER_LINE = 30;

    public static void calculation() {
        final String scrollOfMathSign = "+-*";
        final int length = scrollOfMathSign.length();
        Random mathSign = new Random();
        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] rightAnswers = new String[Engine.COUNT_OF_ROUNDS];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int firstRandomNumber = Utils.createRandomNumber(1, UPPER_LINE);
            int secondRandomNumber = Utils.createRandomNumber(1, UPPER_LINE);
            char operator = scrollOfMathSign.charAt(mathSign.nextInt(length));

            questions[i] = firstRandomNumber + " " + operator + " " + secondRandomNumber;
            rightAnswers[i] = getRightAnswer(firstRandomNumber, secondRandomNumber, operator);
        }
        String gameTask = "What is the result of the expression?";
        Engine.gameBuild(gameTask, questions, rightAnswers);
    }

    private static String getRightAnswer(int firstRandomNumber, int secondRandomNumber, char operator) {
        String rightAnswer = "";
        switch (operator) {
            case '+':
                rightAnswer = Integer.toString(firstRandomNumber + secondRandomNumber);
                break;
            case '-':
                rightAnswer = Integer.toString(firstRandomNumber - secondRandomNumber);
                break;
            case '*':
                rightAnswer = Integer.toString(firstRandomNumber * secondRandomNumber);
                break;
            default:
                break;
        }
        return rightAnswer;
    }
}
