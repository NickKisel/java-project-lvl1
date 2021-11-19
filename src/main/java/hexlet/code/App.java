package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" + "1 - Greet\n"
                + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" + "0 - Exit");
        Scanner choiceGameScanner = new Scanner(System.in);
        String choiceGameStr = choiceGameScanner.nextLine();
        System.out.println("Your choice: " + choiceGameStr);
        switch (choiceGameStr) {
            case "1":
                Cli.greetingsUser();
                break;
            case "2":
                Even.parityCheck();
                break;
            case "3":
                Calc.calculation();
                break;
            case "4":
                GCD.gameGCD();
                break;
            default:
                break;
        }
    }
}
