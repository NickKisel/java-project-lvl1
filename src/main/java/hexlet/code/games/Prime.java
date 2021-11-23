package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    public static void gamePrime() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine gameSix = new Engine();
        String[] question = new String[gameSix.CORRECT];
        String[] value = new String[gameSix.CORRECT];
        for (int i = 0; i < gameSix.CORRECT; i++) {
            int randomNumber = gameSix.createRandomNumber();

            question[i] = Integer.toString(randomNumber);
            value[i] = getPrime(randomNumber);
        }
        System.out.println(gameSix.checkAnswerS(question, value, nameOfUser));
    }

    public static String getPrime(int number) {
        int flagTwo = 2;
        int divider = 1 + flagTwo;
        while (divider < number || number < flagTwo) {
            if (number % divider == 0 || number % flagTwo == 0 || number < flagTwo) {
                return "no";
            }
            divider += flagTwo;
        }
        return "yes";
    }
}
