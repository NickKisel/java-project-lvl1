package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void parityCheck() {
        Engine gameTwo = new Engine();
        String[] question = new String[gameTwo.CORRECT];
        String[] value = new String[gameTwo.CORRECT];
        for (int i = 0; i < gameTwo.CORRECT; i++) {
            int randomNumber = gameTwo.createRandomNumber();

            question[i] = Integer.toString(randomNumber);
            value[i] = getParity(randomNumber);
        }
        String gameTask = "Answer 'yes' if number even otherwise answer 'no'.";
        gameTwo.gameBuild(gameTask, question, value);
    }

    private static String getParity(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
