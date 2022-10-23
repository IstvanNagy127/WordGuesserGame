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
            System.out.println("1 - Easy");
            System.out.println("2 - Medium");
            System.out.println("3 - Hard");
            level = scanner.nextInt();
        } while(level < 1 || level >3);
        return level;
    }
}
