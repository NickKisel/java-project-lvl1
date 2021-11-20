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
        while (rightAnswer < answersForWin) {
            int firstRandomNumber = gameFour.createRandomNumber();
            int secondRandomNumber = gameFour.createRandomNumber();

            System.out.println("Question: " + firstRandomNumber + " " + secondRandomNumber);
            String answer = scanner.nextLine();
            String value = Integer.toString(getGCD(firstRandomNumber, secondRandomNumber));
            System.out.println("Your answer: " + answer);

            rightAnswer = Engine.checkAnswer(value, answer, rightAnswer, nameOfUser);
        }
        System.out.println("Congratulations, " + nameOfUser + "!");
    }

    public static int getGCD(int first, int second) {
        if (first > second) {
            while (second != 0) {
                int remainder = first % second;
                first = second;
                second = remainder;
            }
            return first;
        }
        if (second > first) {
            while (first != 0) {
                int remainder = second % first;
                second = first;
                first = remainder;
            }
            return second;
        }
        return first;
    }
}
