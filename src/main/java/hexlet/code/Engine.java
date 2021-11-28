package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int CORRECT = 3;

    public static void gameBuild(String gameTask, String[] question, String[] value) {
        String nameOfUser = Cli.greetingsUser();
        System.out.println(gameTask);
        System.out.println(checkAnswer(question, value, nameOfUser));
    }

    public static int createRandomNumber() {
        int lowerLine = 1;
        final int upperLine = 30;
        int randomNumber = (int) (lowerLine + Math.random() * upperLine);
        return randomNumber;
    }

    public static String getAnswer(String question) {
        System.out.println("Question: " + question);
        Scanner scannerAnswer = new Scanner(System.in);
        String answer = scannerAnswer.nextLine();
        System.out.println("Your answer: " + answer);
        return answer;
    }

    public static String checkAnswer(String[] question, String[] value, String nameOfUser) {
        for (int i = 0; i < CORRECT; i++) {
            String answer = getAnswer(question[i]);
            if (value[i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                return "'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + value[i] + "'.\n" + "Let's try again, " + nameOfUser + "!";
            }
        }
        return "Congratulations, " + nameOfUser + "!";
    }
}
