package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_OF_ROUNDS = 3;

    public static void gameBuild(String gameTask, String[] question, String[] value) {
        String nameOfUser = Cli.greetingsUser();
        System.out.println(gameTask);
        System.out.println(checkAnswer(question, value, nameOfUser));
    }

    public static String checkAnswer(String[] questions, String[] rightAnswers, String nameOfUser) {
        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {
            System.out.println("Question: " + questions[i]);
            Scanner scannerAnswer = new Scanner(System.in);
            String answer = scannerAnswer.nextLine();
            if (rightAnswers[i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                return "'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + rightAnswers[i] + "'.\n" + "Let's try again, " + nameOfUser + "!";
            }
        }
        return "Congratulations, " + nameOfUser + "!";
    }
}
