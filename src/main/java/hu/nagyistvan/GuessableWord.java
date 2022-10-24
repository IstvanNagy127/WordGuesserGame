package hu.nagyistvan;

import java.util.ArrayList;
import java.util.List;

public class GuessableWord {

    private final List<String> letters = new ArrayList<>();

    public GuessableWord(String theWord) {
        for(int i=0;i<theWord.length();i++) {
            letters.add(i,theWord.substring(i,i+1));
        }
    }

    public List<String> getLetters() {
        return new ArrayList<>(letters);
    }

    public String getLetter(int index) {
        return letters.get(index);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(String letter : letters) {
            result.append(letter);
        }
        return result.toString();
    }
}
