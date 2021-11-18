package hexlet.code.games;

import java.util.Scanner;

public class Greeting {
    public static String greetingsUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner whatsYourName = new Scanner(System.in);
        String nameUser = whatsYourName.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        return nameUser;
    }
}
