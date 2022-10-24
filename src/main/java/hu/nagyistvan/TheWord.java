package hu.nagyistvan;

public class TheWord {

    private String theWord = "example";



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
