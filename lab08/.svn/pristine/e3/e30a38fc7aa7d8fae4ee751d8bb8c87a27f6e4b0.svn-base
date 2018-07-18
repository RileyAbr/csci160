/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

import java.util.Random;

/**
 *
 * @author riley
 */
public class ShakespeareanInsultGenerator {
    
    public static String generateInsult()
    {
        String[] firstWord = new String[]{"bawdy", "craven", "dankish", "frothy", 
            "lumpish", "pribbling", "surly", "villainous"};
        String[] secondWord = new String[]{"beef-witted", "clay-brained", "dizzy-eyed", "flap-mouthed",
            "ill-nurtured", "motley-minded", "sheep-biting", "tickle-brained"};
        String[] thirdWord = new String[]{"bugbear", "clotpole", "harpy", "lout", 
            "miscreant", "molwarp", "puttock", "wagtail"};
        String insult;
        Random rand = new Random();
        
        insult = firstWord[rand.nextInt(8)] + " " + secondWord[rand.nextInt(8)] + " " + thirdWord[rand.nextInt(8)];
        
        return insult;
    }
}
