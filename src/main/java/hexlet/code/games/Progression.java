package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    public static void gameProgression() {
        String nameOfUser = Cli.greetingsUser();

        System.out.println("What number is missing in the progression?");
        int rightAnswer = 0;
        final int answersForWin = 3;
        Scanner scanner = new Scanner(System.in);
        Engine gameFive = new Engine();
        while (rightAnswer < answersForWin) {
            int arrayLength = getArrayLength();
            int[] intArrayOfProgression = new int[arrayLength];
            int progressionStep = gameFive.createRandomNumber();
            int firstElementOfArray = gameFive.createRandomNumber();
            intArrayOfProgression[0] = firstElementOfArray;
            for (int i = 1; i < intArrayOfProgression.length; i++) {
                intArrayOfProgression[i] = intArrayOfProgression[i - 1] + progressionStep;
            }
            String[] strArrayOfProgression = new String[arrayLength];
            for (int j = 0; j < strArrayOfProgression.length; j++) {
                strArrayOfProgression[j] = Integer.toString(intArrayOfProgression[j]);
            }
            int replacement = getReplacement(strArrayOfProgression.length);
            strArrayOfProgression[replacement] = "..";
            System.out.println("Question: " + Arrays.toString(strArrayOfProgression));
            String answer = scanner.nextLine();
            String value = Integer.toString(intArrayOfProgression[replacement]);
            System.out.println("Your answer: " + answer);
            rightAnswer = Engine.checkAnswer(value, answer, rightAnswer, nameOfUser);
        }
        System.out.println("Congratulations, " + nameOfUser + "!");
    }
    public static int getArrayLength() {
        final int lowerLine = 5;
        final int upperLine = 11;
        int arrayLength = (int) (lowerLine + Math.random() * upperLine);
        return arrayLength;
    }
    public static int getReplacement(int arrayLength) {
        final int lowerLine = 0;
        final int upperLine = arrayLength - 1;
        int replacement = (int) (lowerLine + Math.random() * upperLine);
        return replacement;
    }
}
