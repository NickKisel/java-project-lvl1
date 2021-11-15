package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetingsUser(Cli cli) {
        System.out.print("May I have your name? ");
        Scanner whatsYourName = new Scanner(System.in);
        String nameUser = whatsYourName.nextLine();
        System.out.println("Hello, " + nameUser + "!");
    }
}