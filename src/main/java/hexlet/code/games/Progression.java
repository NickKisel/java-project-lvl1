package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int UPPER_LINE_FOR_NUMBER = 30;
    private static final int UPPER_LINE_FOR_STEP = 10;
    private static final int LOWER_LINE_FOR_ARRAY = 6;
    private static final int UPPER_LINE_FOR_ARRAY = 10;

    public static void gameProgression() {
        String[] questions = new String[Engine.CORRECT];
        String[] rightAnswers = new String[Engine.CORRECT];

        for (int i = 0; i < Engine.CORRECT; i++) {
            int firstElementOfArray = Utils.createRandomNumber(1, UPPER_LINE_FOR_NUMBER);
            int progressionStep = Utils.createRandomNumber(1, UPPER_LINE_FOR_STEP);
            int[] intArrayOfProgression = getIntArray(firstElementOfArray, progressionStep);
            String[] strArrayOfProgression = getStringArray(intArrayOfProgression.length, intArrayOfProgression);
            int replacement = Utils.createRandomNumber(1, strArrayOfProgression.length);
            strArrayOfProgression[replacement] = "..";

            questions[i] = printArray(strArrayOfProgression).toString();
            rightAnswers[i] = Integer.toString(intArrayOfProgression[replacement]);
        }
        String gameTask = "What number is missing in the progression?";
        Engine.gameBuild(gameTask, questions, rightAnswers);
    }

    private static int[] getIntArray(int firstElementOfArray, int progressionStep) {
        int[] intArray = new int[Utils.createRandomNumber(LOWER_LINE_FOR_ARRAY, UPPER_LINE_FOR_ARRAY)];
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

    private static StringBuilder printArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb;
    }
}
