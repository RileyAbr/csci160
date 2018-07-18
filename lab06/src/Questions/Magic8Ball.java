/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Random;

/**
 *
 * @author riley
 */
public class Magic8Ball {
    private static Random rand = new Random();
    private static int selectNumber = rand.nextInt(5) + 1;
    
    public static String askQuestion(String question)
    {
        String firstWord;
        String answer = null;
        firstWord = question.substring(0, question.indexOf(" "));
        
        if(firstWord.equals("Who"))
        {
            switch(selectNumber)
            {
                case 1:
                    answer = "Ra-Ra-Rasputin, lover of the Russian queen.";
                    break;
                case 2:
                    answer = "Lil BigDecimal.";
                    break;
                case 3:
                    answer = "That would be your mother.";
                    break;
                case 4:
                    answer = "Voldemort.";
                    break;
                case 5:
                    answer = "Yourself.";
                    break;
                default:
                    answer = "Opps";
                    break;
            }
            selectNumber = rand.nextInt(5) + 1;
            return answer;
        }
        else if(firstWord.equals("What"))
        {
            switch(selectNumber)
            {
                case 1:
                    answer = "42.";
                    break;
                case 2:
                    answer = "A vat of BBQ sauce.";
                    break;
                case 3:
                    answer = "One. Million. Dollars.";
                    break;
                case 4:
                    answer = "A Camel.";
                    break;
                case 5:
                    answer = "A careless whisper.";
                    break;
                default:
                    answer = "Opps";
                    break;
            }
            selectNumber = rand.nextInt(5) + 1;
            return answer;
        }
        else if(firstWord.equals("Where"))
        {
            switch(selectNumber)
            {
                case 1:
                    answer = "The autobahn.";
                    break;
                case 2:
                    answer = "Chuck E Cheese's.";
                    break;
                case 3:
                    answer = "The rings of saturn.";
                    break;
                case 4:
                    answer = "Olive Garden.";
                    break;
                case 5:
                    answer = "Minard Hall.";
                    break;
                default:
                    answer = "Opps";
                    break;
            }
            selectNumber = rand.nextInt(5) + 1;
            return answer;
        }
        else if(firstWord.equals("Why"))
        {
            switch(selectNumber)
            {
                case 1:
                    answer = "Because we can.";
                    break;
                case 2:
                    answer = "Why not?";
                    break;
                case 3:
                    answer = "Lots of glue.";
                    break;
                case 4:
                    answer = "Ask your parents.";
                    break;
                case 5:
                    answer = "Fire and brimstone.";
                    break;
                default:
                    answer = "Opps";
                    break;
            }
            selectNumber = rand.nextInt(5) + 1;
            return answer;
        }
        else if(firstWord.equals("When"))
        {
            switch(selectNumber)
            {
                case 1:
                    answer = "Tomorrow.";
                    break;
                case 2:
                    answer = "Right NOW.";
                    break;
                case 3:
                    answer = "Next weekend.";
                    break;
                case 4:
                    answer = "Forever.";
                    break;
                case 5:
                    answer = "Last semester.";
                    break;
                default:
                    answer = "Opps";
                    break;
            }
            selectNumber = rand.nextInt(5) + 1;
            return answer;
        }
        else if(firstWord.equals("How"))
        {
            switch(selectNumber)
            {
                case 1:
                    answer = "By asking nicely.";
                    break;
                case 2:
                    answer = "With a big backscratcher.";
                    break;
                case 3:
                    answer = "With a VR headset.";
                    break;
                case 4:
                    answer = "Alone.";
                    break;
                case 5:
                    answer = "By filling up the bathtub.";
                    break;
                default:
                    answer = "Opps";
                    break;
            }
            selectNumber = rand.nextInt(5) + 1;
            return answer;
        }
        else
        {
            switch(selectNumber)
            {
                case 1:
                    answer = "Try again later.";
                    break;
                case 2:
                    answer = "Yeah I've got nothing.";
                    break;
                case 3:
                    answer = "...?";
                    break;
                case 4:
                    answer = "Seven?";
                    break;
                case 5:
                    answer = "You poor soul.";
                    break;
                default:
                    answer = "Opps";
                    break;
            }
            selectNumber = rand.nextInt(5) + 1;
            return answer;
        }
    }
}

