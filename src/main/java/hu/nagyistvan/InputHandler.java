package hu.nagyistvan;

import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public int chooseDifficulty() {
        int level;
        do {
            System.out.println("Válasszon nehézségi szintet:");
            System.out.println("1 - Könnyű");
            System.out.println("2 - Közepes");
            System.out.println("3 - Nehéz");
            level = scanner.nextInt();
        } while(level < 1 || level >3);
        return level;
    }

    public String readLetter() {
        String input;
        boolean correctInput;

        do {
            System.out.println("Adjon meg egy betűt: ");
            input = scanner.nextLine().toUpperCase();
            if(input.matches("[A-Z]")) {
                correctInput = true;
            } else {
                correctInput = false;
                System.out.println("Érvénytelen karaktert adott meg, próbálja újra!");
            }
        } while(!correctInput);

        return input;
    }
}
