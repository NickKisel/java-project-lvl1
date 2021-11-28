package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void gameProgression() {
        Engine gameFive = new Engine();
        String[] question = new String[gameFive.CORRECT];
        String[] value = new String[gameFive.CORRECT];
        for (int i = 0; i < gameFive.CORRECT; i++) {
            int firstElementOfArray = gameFive.createRandomNumber();
            int progressionStep = gameFive.createRandomNumber();
            int[] intArrayOfProgression = getIntArray(firstElementOfArray, progressionStep);
            String[] strArrayOfProgression = getStringArray(intArrayOfProgression.length, intArrayOfProgression);
            int replacement = getReplacement(strArrayOfProgression.length);
            strArrayOfProgression[replacement] = "..";

            question[i] = printArray(strArrayOfProgression).toString();
            value[i] = Integer.toString(intArrayOfProgression[replacement]);
        }
        String gameTask = "What number is missing in the progression?";
        gameFive.gameBuild(gameTask, question, value);
    }

    private static int getArrayLength() {
        final int lowerLine = 6;
        final int upperLine = 10;
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

    private static StringBuilder printArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb;
    }
}
