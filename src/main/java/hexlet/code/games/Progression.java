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
            int firstElementOfArray = gameFive.createRandomNumber();
            int progressionStep = gameFive.createRandomNumber();
            int[] intArrayOfProgression = getIntArray(firstElementOfArray, progressionStep);
            String[] strArrayOfProgression = getStringArray(intArrayOfProgression.length, intArrayOfProgression);
            int replacement = getReplacement(strArrayOfProgression.length);
            strArrayOfProgression[replacement] = "..";

            gameFive.getQuestion(Arrays.toString(strArrayOfProgression));
            String answer = scanner.nextLine();
            String value = Integer.toString(intArrayOfProgression[replacement]);
            gameFive.getAnswer(answer);

            rightAnswer = Engine.checkAnswer(value, answer, rightAnswer, nameOfUser);
        }
        gameFive.congratulation(nameOfUser);
    }

    private static int getArrayLength() {
        final int lowerLine = 5;
        final int upperLine = 11;
        int arrayLength = (int) (lowerLine + Math.random() * upperLine);
        return arrayLength;
    }

    private static int getReplacement(int arrayLength) {
        final int lowerLine = 0;
        final int upperLine = arrayLength - 1;
        int replacement = (int) (lowerLine + Math.random() * upperLine);
        return replacement;
    }

    private static int[] getIntArray(int firstElementOfArray, int progressionStep) {
        int[] intArray = new int[getArrayLength()];
        intArray[0] = firstElementOfArray;
        for (int i = 1; i < intArray.length; i++) {
            intArray[i] = intArray[i - 1] + progressionStep;
        }
        return intArray;
    }

    private static String[] getStringArray(int length, int[] intArray) {
        String[] strArray = new String[length];
        for (int j = 0; j < strArray.length; j++) {
            strArray[j] = Integer.toString(intArray[j]);
        }
        return strArray;
    }
}
