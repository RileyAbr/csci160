/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Animal;
import java.util.ArrayList;

/**
 *
 * @author riley
 */
public class Zoo {
    
    private ArrayList<Animal> zooAnimals;
    
    public Zoo()
    {
        zooAnimals = new ArrayList<Animal>();
    }
    
    public void addAnimal(Animal newAnimal)
    {
        zooAnimals.add(newAnimal);
    }
    
    public String listAnimals()
    {
        String returnListAnimals = "";
        
        for(Animal zooanmls : zooAnimals)
        {
            returnListAnimals += zooanmls.toString() + "\n";
        }
        
        return returnListAnimals;
    }
    
}
