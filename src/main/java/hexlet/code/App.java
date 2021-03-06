package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        Scanner choiceGameScanner = new Scanner(System.in);
        String choiceGameStr = choiceGameScanner.nextLine();
        System.out.println("Your choice: " + choiceGameStr);
        runGame(choiceGameStr);
    }

    private static void runGame(String choice) {
        switch (choice) {
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
            case "5":
                Progression.gameProgression();
                break;
            case "6":
                Prime.gamePrime();
                break;
            default:
                break;
        }
    }
}
