package hu.nagyistvan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayGround {

    GuessableWord word = new GuessableWord("example");
    private final Map<Integer, String> gamePad = new HashMap<>();
    private final List<String> solution = word.getLetters();

    public PlayGround() {
        for(int i =0;i<solution.size();i++) {
            gamePad.put(i, word.getLetter(i));
        }
    }



    @Override
    public String toString() {
        StringBuilder ground = new StringBuilder();
        for(String letter : solution) {
            ground.append("_");
        }
        return ground.toString();
    }

    public boolean isInvented() {
        return true;
    }
}
