/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyUnitTests;

import ProvidedClasses.Restaurant;
import ProvidedClasses.Restaurant.Mode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class DiscountMethodTest {
    
    // This field intentionally left public to allow for unit tests to function properly.
    public static Restaurant testRestaurant;
    
    /**
     * This method runs before any unit tests are run and initializes a common test object
     *  that can be used by each of the different unit tests.
     * You can use the default constructor for the Restaurant class to have a random test
     *  mode (i.e. what version of the discount method is used) each time or you can 
     *  use the Constructor method that allows you to set the Mode for specific testing. 
     * Don't remove the selection statement as it is necessary for the unit tests to function properly.
     */
    @BeforeClass
    public static void BeforeClass()
    {
        // Do not remove selection statement
        if(testRestaurant == null)
        {
            // You can modify the Mode as you wish or use a Random mode each time
            //testRestaurant = new Restaurant();     // Random Mode
            testRestaurant = new Restaurant(Mode.WORKS_CORRECTLY); // Specific Mode
        }
        
        // Announce which mode is being used and describe it. 
        System.out.println("Testing Restaurant with " + testRestaurant.getMode() + " Mode: " + testRestaurant.getModeDescription());
    }
    
    
    @Test
    public void testExample()
    {   
        // setup test parameters
        int     age = 10;
        boolean militaryStatus = false;
        
        // determined expected value and actual value
        boolean expected = false; 
        boolean actual   = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus); 
        
        // use assert method to compare
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void child6Discount()
    {
        int age = 6;
        boolean militaryStatus = false;
        
        boolean expected = true;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void childUnder6Discount()
    {
        int age = 5;
        boolean militaryStatus = false;
        
        boolean expected = true;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void child6MiltaryDiscount()
    {
        int age = 6;
        boolean militaryStatus = true;
        
        boolean expected = false;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
        @Test
    public void childUnder6MiltaryDiscount()
    {
        int age = 5;
        boolean militaryStatus = true;
        
        boolean expected = false;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void senior65Discount()
    {
        int age = 65;
        boolean militaryStatus = false;
        
        boolean expected = true;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void seniorOver65Discount()
    {
        int age = 66;
        boolean militaryStatus = false;
        
        boolean expected = true;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void adult16Military()
    {
        int age = 16;
        boolean militaryStatus = true;
        
        boolean expected = true;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
        @Test
    public void adultUnder16Military()
    {
        int age = 15;
        boolean militaryStatus = true;
        
        boolean expected = false;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void adult16PlusMiltaryDiscount()
    {
        int age = 17;
        boolean militaryStatus = true;
        
        boolean expected = true;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void senior65MilitaryDiscount()
    {
        int age = 65;
        boolean militaryStatus = true;
        
        boolean expected = true;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void seniorOver65MilitaryDiscount()
    {
        int age = 66;
        boolean militaryStatus = true;
        
        boolean expected = true;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void child0Discount()
    {
        int age = 0;
        boolean militaryStatus = false;
        
        boolean expected = false;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void child0MilitaryDiscount()
    {
        int age = 0;
        boolean militaryStatus = true;
        
        boolean expected = false;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void under0Discount()
    {
        int age = -1;
        boolean militaryStatus = false;
        
        boolean expected = false;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
    
    @Test
    public void under0MilitaryDiscount()
    {
        int age = -1;
        boolean militaryStatus = true;
        
        boolean expected = false;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);
        
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }
}
