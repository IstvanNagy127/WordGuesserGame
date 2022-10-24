package hu.nagyistvan;

import java.util.ArrayList;
import java.util.List;

public class PlayGround {
   private TheWord theWord = new TheWord();
    private String solution = theWord.getTheWord();
    private List<Character> playerGuesses = new ArrayList<>();

    public void addChar(char letter) {
        playerGuesses.add(letter);
    }


    public void drawing() {
        for(int i=0; i< solution.length(); i++) {
            if(playerGuesses.contains(solution.charAt(i))) {
                System.out.print(solution.charAt(i));
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }


    public boolean isComplete() {
        return false;
    }
}
