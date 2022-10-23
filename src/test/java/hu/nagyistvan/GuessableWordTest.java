package hu.nagyistvan;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessableWordTest {

    GuessableWord word = new GuessableWord("ocean");
    @Test
    public void getLetters() {
        assertEquals("ocean",word.toString());
    }

}