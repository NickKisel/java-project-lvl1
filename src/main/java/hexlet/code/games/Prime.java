package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void gamePrime() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int rightAnswer = 0;
        final int answersForWin = 3;
        Scanner scanner = new Scanner(System.in);
        Engine gameSix = new Engine();
        while (rightAnswer < answersForWin) {
            int randomNumber = gameSix.createRandomNumber();
            System.out.println("Question: " + randomNumber);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            String value = getPrime(randomNumber);

            rightAnswer = gameSix.checkAnswer(value, answer, rightAnswer, nameOfUser);
        }
        System.out.println("Congratulations, " + nameOfUser + "!");
    }

    public static String getPrime(int number) {
        int flagTwo = 2;
        if (number == flagTwo) {
            return "yes";
        }
        if (number % 2 == 0 || number < flagTwo) {
            return "no";
        }
        int divider = 1 + flagTwo;
        while (divider < number) {
            if (number % divider == 0) {
                return "no";
            }
            divider += flagTwo;
        }
        return "yes";
    }
}
