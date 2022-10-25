package hu.nagyistvan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TheWord {

    File file = new File("C:\\Users\\Osza The King\\IdeaProjects\\WordGuesserGame\\src\\main\\java\\hu\\nagyistvan\\words.txt");
    private String theWord ="";
    List<String> wordsFromTxt = new ArrayList<>();

    public TheWord(){
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                wordsFromTxt.add(sc.nextLine());
                Random random = new Random();
                theWord = wordsFromTxt.get(random.nextInt(wordsFromTxt.size()));
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

    }

    public String getTheWord() {
        return theWord;
    }

    public void setTheWord(String theWord) {
        this.theWord = theWord;
    }

    @Override
    public String toString() {
        return theWord;
    }
}
