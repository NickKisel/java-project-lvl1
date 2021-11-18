package hexlet.code;

public class Engine {
    public static int createRandomNumber() {
        final int lowerLine = 1;
        final int upperLine = 30;
        int randomNumber = (int) (lowerLine + Math.random() * upperLine);
        return randomNumber;
    }

    public static int checkAnswer(String value, String answer, int rightAnswer, String nameOfUser) {
        if (value.equals(answer)) {
            rightAnswer++;
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + value + "'.\n" + "Let's try again, " + nameOfUser + "!");
        }
        return rightAnswer;
    }
}
