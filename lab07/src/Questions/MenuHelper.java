/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Scanner;

/**
 *
 * @author riley
 */
public class MenuHelper {
    
    public static int displayMenu(String message, int min, int max)
    {
        Scanner scan = new Scanner(System.in);
        int userChoice;
        
        System.out.print(message);
        
        while (!scan.hasNextInt()) 
        {
            scan.nextLine();

            System.out.println("Please enter a number between " + min + " and " + max + ":");
        }
        
        userChoice = scan.nextInt();
        
        while ( userChoice < min || userChoice > max)
        {
            System.out.println("Please enter a number between " + min + " and " + max + ":");
            
            while (!scan.hasNextInt())
            {
                scan.nextLine();
                System.out.println("Please enter a number between " + min + " and " + max + ":");
            }
            
            userChoice = scan.nextInt();
        }

        return userChoice;
    }
    
    public static void main(String[] args) {
        
        int choice1;
        int choice2;
        int choice3;
        
        choice1 = MenuHelper.displayMenu("Please choose a main course:\n"
                + "1)Chicken\n"
                + "2)Beef\n"
                + "3)Pork\n"
                + "Please enter a selection 1 - 3: ", 1, 3);
        
        choice2 = MenuHelper.displayMenu("Please choose a side:\n"
                + "1)Baked Potato\n"
                + "2)Soup\n"
                + "3)Salad\n"
                + "4)Vegetables\n"
                + "Please enter a selection 1 - 4: ", 1, 4);
        
        choice3 = MenuHelper.displayMenu("Please choose a side:\n"
                + "1)Baked Potato\n"
                + "2)Soup\n"
                + "3)Salad\n"
                + "4)Vegetables\n"
                + "Please enter a selection 1 - 4: ", 1, 4);
        
        System.out.println("You selected options " + choice1 + ", " + choice2 + ", " + choice3 + " for your options.");
        
    }
}
