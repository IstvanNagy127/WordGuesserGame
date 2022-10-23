package hu.nagyistvan;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Game
{
    public static void main( String[] args )
    {
        try(Scanner scanner = new Scanner(System.in)) {
            new Game().run(scanner);
        }
    }

    private void run(Scanner scanner) {
        InputHandler inputHandler = new InputHandler(scanner);
        int diffLevel = inputHandler.chooseDifficulty();
        switch (diffLevel) {
            case 1 : System.out.println("here will be the easy game");
            break;
            case 2 : System.out.println("here will be the normal game");
                break;
            case 3 : System.out.println("here will be the hard game");
                break;
            default : System.out.println("error");
                break;
        }
    }
}