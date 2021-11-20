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
        while (rightAnswer < answersForWin) {
            int firstRandomNumber = gameThree.createRandomNumber();
            int secondRandomNumber = gameThree.createRandomNumber();
            char operator = scrollOfMathSign.charAt(mathSign.nextInt(length));

            System.out.println("Question: " + firstRandomNumber + " " + operator + " " + secondRandomNumber);
            String answer = scanner.nextLine();
            String value;
            System.out.println("Your answer: " + answer);
            switch (operator) {
                case '+':
                    value = Integer.toString(firstRandomNumber + secondRandomNumber);
                    rightAnswer = gameThree.checkAnswer(value, answer, rightAnswer, nameOfUser);
                    break;
                case '-':
                    value = Integer.toString(firstRandomNumber - secondRandomNumber);
                    rightAnswer = gameThree.checkAnswer(value, answer, rightAnswer, nameOfUser);
                    break;
                case '*':
                    value = Integer.toString(firstRandomNumber * secondRandomNumber);
                    rightAnswer = gameThree.checkAnswer(value, answer, rightAnswer, nameOfUser);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Congratulations, " + nameOfUser + "!");
    }
}
