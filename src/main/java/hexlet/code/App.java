package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" + "1 - Greet\n"
                + "2 - Even\n" + "0 - Exit");
        Scanner choiceGameScanner = new Scanner(System.in);
        String choiceGameStr = choiceGameScanner.nextLine();
        System.out.println("Your choice: " + choiceGameStr);
        if ("1".equals(choiceGameStr)) {
            Cli greetings = new Cli();
            Cli.greetingsUser(greetings);
        }
        if ("2".equals(choiceGameStr)) {
            Even gameTwo = new Even();
            Even.parityCheck(gameTwo);
        }
    }
}
