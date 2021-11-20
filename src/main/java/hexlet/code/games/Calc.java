package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calculation() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("What is the result of the expression?");
        int rightAnswer = 0;
        final int answersForWin = 3;
        final String scrollOfMathSign = "+-*";
        final int length = scrollOfMathSign.length();
        Scanner scanner = new Scanner(System.in);
        Random mathSign = new Random();
        Engine gameThree = new Engine();
        for (int i = 0; i < answersForWin; i++) {
            int firstRandomNumber = gameThree.createRandomNumber();
            int secondRandomNumber = gameThree.createRandomNumber();
            char operator = scrollOfMathSign.charAt(mathSign.nextInt(length));

            gameThree.getQuestion(firstRandomNumber + " " + operator + " " + secondRandomNumber);
            String answer = scanner.nextLine();
            String value = getValue(firstRandomNumber, secondRandomNumber, operator);
            gameThree.getAnswer(answer);

            rightAnswer = gameThree.checkAnswer(value, answer, rightAnswer, nameOfUser);
            if (rightAnswer == -1) {
                break;
            }
        }
        if (rightAnswer == answersForWin) {
            gameThree.congratulation(nameOfUser);
        }
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
