package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void gameGCD() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("Find the greatest common divisor of given numbers.");
        int rightAnswer = 0;
        final int answersForWin = 3;
        Scanner scanner = new Scanner(System.in);
        Engine gameFour = new Engine();
        for (int i = 0; i < answersForWin; i++) {
            int firstRandomNumber = gameFour.createRandomNumber();
            int secondRandomNumber = gameFour.createRandomNumber();

            String question = firstRandomNumber + " " + secondRandomNumber;
            String answer = gameFour.interactionWithUser(question);
//            gameFour.getQuestion(question);
//            String answer = scanner.nextLine();
            String value = Integer.toString(getGCD(firstRandomNumber, secondRandomNumber));
//            gameFour.getAnswer(answer);

            rightAnswer = Engine.checkAnswer(value, answer, rightAnswer, nameOfUser);
            if (rightAnswer == -1) {
                break;
            }
        }
        if (rightAnswer == answersForWin) {
            gameFour.congratulation(nameOfUser);
        }
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
