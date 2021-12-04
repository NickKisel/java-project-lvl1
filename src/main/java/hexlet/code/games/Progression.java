package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int UPPER_LINE_FOR_NUMBER = 30;
    private static final int UPPER_LINE_FOR_STEP = 10;
    private static final int LOWER_LINE_FOR_ARRAY = 6;
    private static final int UPPER_LINE_FOR_ARRAY = 10;

    public static void gameProgression() {
        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] rightAnswers = new String[Engine.COUNT_OF_ROUNDS];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int firstElementOfArray = Utils.createRandomNumber(1, UPPER_LINE_FOR_NUMBER);
            int progressionStep = Utils.createRandomNumber(1, UPPER_LINE_FOR_STEP);
            int[] intArrayOfProgression = getIArray(firstElementOfArray, progressionStep);
            String[] strArrayOfProgression = getSArray(intArrayOfProgression.length, intArrayOfProgression);
            int replacement = Utils.createRandomNumber(1, strArrayOfProgression.length - 1);
            strArrayOfProgression[replacement] = "..";

            questions[i] = printArray(strArrayOfProgression).toString();
            rightAnswers[i] = Integer.toString(intArrayOfProgression[replacement]);
        }
        String gameTask = "What number is missing in the progression?";
        Engine.gameBuild(gameTask, questions, rightAnswers);
    }

    private static int[] getIArray(int firstElementOfArray, int progressionStep) {
        int[] iArray = new int[Utils.createRandomNumber(LOWER_LINE_FOR_ARRAY, UPPER_LINE_FOR_ARRAY)];
        iArray[0] = firstElementOfArray;
        for (int i = 1; i < iArray.length; i++) {
            iArray[i] = iArray[i - 1] + progressionStep;
        }
        return iArray;
    }

    private static String[] getSArray(int length, int[] intArray) {
        String[] sArray = new String[length];
        for (int j = 0; j < sArray.length; j++) {
            sArray[j] = Integer.toString(intArray[j]);
        }
        return sArray;
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
