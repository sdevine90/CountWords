package com.example.user.countwords;
import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.*;


/**
 * Created by user on 13/12/2016.
 */
public class WordcountTest {
    Wordcount sentence;

    @Before
    public void before() {
        sentence = new Wordcount("Soft kitty warm kitty little ball of fur");
    }

    @Test
    public void getWordsTest(){
    assertEquals(8, sentence.getWords());
    }
}
