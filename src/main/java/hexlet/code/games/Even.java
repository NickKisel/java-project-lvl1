package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int UPPER_LINE = 30;

    public static void parityCheck() {
        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] rightAnswers = new String[Engine.COUNT_OF_ROUNDS];

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {
            int randomNumber = Utils.createRandomNumber(1, UPPER_LINE);

            questions[i] = Integer.toString(randomNumber);
            rightAnswers[i] = isEven(randomNumber) ? "yes" : "no";
        }
        String gameTask = "Answer 'yes' if number even otherwise answer 'no'.";
        Engine.gameBuild(gameTask, questions, rightAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
