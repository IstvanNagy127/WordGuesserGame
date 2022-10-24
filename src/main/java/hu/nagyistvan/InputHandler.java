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
            scanner.nextLine();
        } while(level < 1 || level >3);
        return level;
    }

    public char readLetter() {
        System.out.println("kérem adja meg egy betűt:");
        String input = scanner.nextLine();
         return input.charAt(0);


    }

    public String readGuess() {
        System.out.println("Tippeljen mi a megfejtés?");
        String input = scanner.nextLine();
        return input;
    }
}
