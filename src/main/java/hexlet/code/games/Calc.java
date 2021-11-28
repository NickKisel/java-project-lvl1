package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void calculation() {
        final String scrollOfMathSign = "+-*";
        final int length = scrollOfMathSign.length();
        Random mathSign = new Random();
        Engine gameThree = new Engine();
        String[] question = new String[gameThree.CORRECT];
        String[] value = new String[gameThree.CORRECT];
        for (int i = 0; i < gameThree.CORRECT; i++) {
            int firstRandomNumber = gameThree.createRandomNumber();
            int secondRandomNumber = gameThree.createRandomNumber();
            char operator = scrollOfMathSign.charAt(mathSign.nextInt(length));

            question[i] = firstRandomNumber + " " + operator + " " + secondRandomNumber;
            value[i] = getValue(firstRandomNumber, secondRandomNumber, operator);
        }
        String gameTask = "What is the result of the expression?";
        gameThree.gameBuild(gameTask, question, value);
    }

    private static String getValue(int firstRandomNumber, int secondRandomNumber, char operator) {
        String value = "";
        switch (operator) {
            case '+':
                value = Integer.toString(firstRandomNumber + secondRandomNumber);
                break;
            case '-':
                value = Integer.toString(firstRandomNumber - secondRandomNumber);
                break;
            case '*':
                value = Integer.toString(firstRandomNumber * secondRandomNumber);
                break;
            default:
                break;
        }
        return value;
    }
}
