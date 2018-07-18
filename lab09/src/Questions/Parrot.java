/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author riley
 */
public class Parrot extends Bird {
    
    protected ArrayList<String> listWords = new ArrayList<String>();
    
    public Parrot()
    {
        super("Polly", 2010, Color.GREEN);
        listWords.add("Polly");
    }
    
    public void addWord(String newWord)
    {
        listWords.add(newWord);
    }
    
    public String listWordsKnown()
    {
        String list = "";
        
        for(String word: listWords)
        {
            list += word + "; ";
        }
        
        return list;
    }
    
    public String toString()
    {
        return super.toString() +", "+ listWordsKnown();
    }
    
}
