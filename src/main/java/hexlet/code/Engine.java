package hexlet.code;

import java.util.Scanner;

public class Engine {
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

    public static int checkAnswer(String value, String answer, int rightAnswer, String nameOfUser) {
        if (value.equals(answer)) {
            rightAnswer++;
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + value + "'.\n" + "Let's try again, " + nameOfUser + "!");
            return -1;
        }
        return rightAnswer;
    }

//    public static void getQuestion(String question) {
//        System.out.println("Question: " + question);
//    }
//
//    public static void getAnswer(String answer) {
//        System.out.println("Your answer: " + answer);
//    }

    public static void congratulation(String nameOfUser) {
        System.out.println("Congratulations, " + nameOfUser + "!");
    }
}
