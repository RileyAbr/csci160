/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Scanner;

/**
 *
 * @author (Your Name Here)
 */
public class Question1 {

    public static int[] question1() {
        /**
         * For this part of the assignment you will be creating a while loop
         * that reads in integer values entered by a user using the console
         * until they enter a negative number, at which point the loop should
         * quit and display (print out) the following information:
         *
         * count - the number of iterations made by the loop total - the total
         * of all values entered (excluding the negative value) minimum - the
         * smallest number entered by the user (-1 if no values entered) maximum
         * - the largest number entered by the user (-1 if no values entered)
         *
         * When outputting the results it should be of a form similar to the
         * following: (Make sure that capitalization, punctuation, and spelling
         * matches)
         *
         * Output: count: 4 total: 24 minimum: 0 maximum: 20
         *
         * Your loop should also be type-safe in that the program will not crash
         * if non-integer data is encountered. You should display a message
         * similar to the following if the user enters a non-integer value:
         * "That is not an integer, please try again." (Hint: The error message
         * MUST contain at least the phrase "not an integer")
         *
         * Additionally, you should declare int variables with the identifiers
         * count, total, minimum, and maximum to store the various values above.
         *
         * Note: Make sure to include a message prompting a user to enter
         * integer numbers or a negative number to quit before reading any
         * input. (Hint: The prompt message MUST include the keywords "Enter"
         * and "negative")
         *
         * Note 2: This program contains a main method that can be used to
         * manually test your code by right-clicking Question1.java and
         * selecting "Run File"          *
         */

        // Your code goes here
        int count = 0;
        int total = 0;
        int maximum = -1;
        int minimum;
        Scanner scan = new Scanner(System.in);
        int value;
        

        System.out.println("Enter numbers to see stats about the numbers you have entered. "
                + "Enter a negative number to stop: ");

        while (!scan.hasNextInt())
        {
            scan.nextLine(); 

            System.out.println("That's not an integer.");
            System.out.print("Try again: ");
        }

        value = scan.nextInt();
        minimum = value;
        
        while (value >= 0) 
        {
            count++;
            total = total + value;

            if (value < minimum) {
                minimum = value;
            }

            if (value > maximum) {
                maximum = value;
            }

            while (!scan.hasNextInt()) 
            {
                scan.nextLine();

                System.out.println("That's not an integer.");
                System.out.print("Try again: ");
            }
            
            value = scan.nextInt();   
        } 
        
        System.out.println("\nAfter run stats:");
        System.out.println("count: " + count);
        System.out.println("total: " + total);
        System.out.println("minimum: " + minimum);
        System.out.println("maximum: " + maximum);


        // necessary for unit test, do not remove
        return new int[]{count, total, minimum, maximum};
    }

    public static void main(String[] args) {
        int[] results = question1();
        System.out.println("\nAfter run stats:");
        System.out.println("count: " + results[0]);
        System.out.println("total: " + results[1]);
        System.out.println("minimum: " + results[2]);
        System.out.println("maximum: " + results[3]);
    }
}
