package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    public static void gameGCD() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("Find the greatest common divisor of given numbers.");
        Engine gameFour = new Engine();
        String[] question = new String[gameFour.CORRECT];
        String[] value = new String[gameFour.CORRECT];
        for (int i = 0; i < gameFour.CORRECT; i++) {
            int firstRandomNumber = gameFour.createRandomNumber();
            int secondRandomNumber = gameFour.createRandomNumber();

            question[i] = firstRandomNumber + " " + secondRandomNumber;
            value[i] = Integer.toString(getGCD(firstRandomNumber, secondRandomNumber));
        }
        System.out.println(gameFour.checkAnswerS(question, value, nameOfUser));
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
