/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyUnitTests;

import Questions.ScrabbleScore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class ScrabbleScoreTest {
    
    public ScrabbleScoreTest() {
    }

    @Test
    public void templateTest() 
    {
        // setup test values
        
        // set expected result
        
        // get actual result
        
        // compare expected and actual results
        
    }

    @Test
    public void emptyWordTest() 
    {
        // setup test values
        String word = "";
        // set expected result
        int expected = -1;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void nullWordTest() 
    {
        // setup test values
        String word = null;
        // set expected result
        int expected = -1;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void allBlankWordTest() 
    {
        // setup test values
        String word = "   ";
        // set expected result
        int expected = 0;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void onePointWordTest() 
    {
        // setup test values
        String word = "e";
        // set expected result
        int expected = 1;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void twoPointWordTest() 
    {
        // setup test values
        String word = "d";
        // set expected result
        int expected = 2;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void threePointWordTest() 
    {
        // setup test values
        String word = "b";
        // set expected result
        int expected = 3;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void fourPointWordTest() 
    {
        // setup test values
        String word = "f";
        // set expected result
        int expected = 4;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void fivePointWordTest() 
    {
        // setup test values
        String word = "k";
        // set expected result
        int expected = 5;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void eightPointWordTest() 
    {
        // setup test values
        String word = "j";
        // set expected result
        int expected = 8;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void tenPointWordTest() 
    {
        // setup test values
        String word = "q";
        // set expected result
        int expected = 10;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void lettersAndSpacesWordTest() 
    {
        // setup test values
        String word = "H ppy";
        // set expected result
        int expected = 14;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void numbersTest() 
    {
        // setup test values
        String word = "1234";
        // set expected result
        int expected = -1;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void lettersAndNumbersTest() 
    {
        // setup test values
        String word = "abc123";
        // set expected result
        int expected = -1;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void lettersAndNumbersAndSpacesTest() 
    {
        // setup test values
        String word = "ab c 1 23";
        // set expected result
        int expected = -1;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
    
    @Test
    public void uppercaseTest() 
    {
        // setup test values
        String word = "LOUD";
        // set expected result
        int expected = 5;
        // get actual result
        int actual = ScrabbleScore.calculateScore(word);
        // compare expected and actual results
        assertEquals("Testing the score for " + word + ".", expected, actual);
        
    }
}
