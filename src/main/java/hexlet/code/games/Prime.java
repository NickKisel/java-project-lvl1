package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

//import java.util.Scanner;

public class Prime {
    public static void gamePrime() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int rightAnswer = 0;
        final int answersForWin = 3;
//        Scanner scanner = new Scanner(System.in);
        Engine gameSix = new Engine();
        for (int i = 0; i < answersForWin; i++) {
            int randomNumber = gameSix.createRandomNumber();

            String question = Integer.toString(randomNumber);
            String answer = gameSix.interactionWithUser(question);
//            gameSix.getQuestion(Integer.toString(randomNumber));
//            String answer = scanner.nextLine();
//            gameSix.getAnswer(answer);
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

    private static String getPrime(int number) {
        int flagTwo = 2;
        if (number % flagTwo == 0 && number != flagTwo || number < flagTwo) {
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
