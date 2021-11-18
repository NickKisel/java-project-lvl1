package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" + "1 - Greet\n"
                + "2 - Even\n" + "3 - Calc\n" + "0 - Exit");
        Scanner choiceGameScanner = new Scanner(System.in);
        String choiceGameStr = choiceGameScanner.nextLine();
        System.out.println("Your choice: " + choiceGameStr);
        if ("1".equals(choiceGameStr)) {
            Cli.greetingsUser();
        }
        if ("2".equals(choiceGameStr)) {
            Even.parityCheck();
        }
        if ("3".equals(choiceGameStr)) {
            Calc.calculation();
        }
    }
}
