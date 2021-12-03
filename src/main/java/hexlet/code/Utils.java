package hexlet.code;

public class Utils {
    public static int createRandomNumber(int lowerLine, int upperLine) {
        return (int) (lowerLine + Math.random() * upperLine);
    }
}
