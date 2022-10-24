package hu.nagyistvan;

import java.util.*;

public class PlayGround {

    GuessableWord word = new GuessableWord("example");
    private Map<Integer, SolutionLetter> gamePad = new HashMap<>();
    private List<String> solution = word.getLetters();

    StringBuilder ground = new StringBuilder();

    public PlayGround() {
        for(int i =0;i<solution.size();i++) {
            gamePad.put(i, new SolutionLetter(word.getLetter(i)));
        }
    }

    public void checking(String inputLetter) {
        for(Map.Entry<Integer, SolutionLetter> mapLetter : gamePad.entrySet()) {
            if(inputLetter == mapLetter.getValue().getValue()) {
               mapLetter.setValue(new SolutionLetter(inputLetter, true));
            }
        }
    }


    @Override
    public String toString() {

        for(Map.Entry<Integer, SolutionLetter> mapLetter : gamePad.entrySet()) {
            if(mapLetter.getValue().isHit()) {
                ground.append(mapLetter.getValue());
            } else {
                ground.append("_");
            }
        }
        return ground.toString();
    }

    public boolean isInvented() {
        if(word.toString() == ground.toString()) {
            return true;
        } else {
            return false;
        }
    }
}
