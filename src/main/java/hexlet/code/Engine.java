package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int CORRECT = 3;

    public static int createRandomNumber() {
        int lowerLine = 1;
        final int upperLine = 30;
        int randomNumber = (int) (lowerLine + Math.random() * upperLine);
        return randomNumber;
    }

    public static String interactionWithUser(String question) {
        System.out.println("Question: " + question);
        Scanner scannerAnswer = new Scanner(System.in);
        String answer = scannerAnswer.nextLine();
        System.out.println("Your answer: " + answer);
        return answer;
    }

    public static String checkAnswerS(String[] question, String[] value, String name) {
        for (int i = 0; i < CORRECT; i++) { //тут 3, придумать константу
            String answer = interactionWithUser(question[i]);
            if (value[i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                return "'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + value[i] + "'.\n" + "Let's try again, " + name + "!";
            }
        }
        return "Congratulations, " + name + "!";
    }

    public static void congratulation(String nameOfUser) {
        System.out.println("Congratulations, " + nameOfUser + "!");
    }
}
