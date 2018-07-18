package Questions.Chapter8;

/**
 *
 * @author (Your Name Here)
 */
public class Question1 
{
    /*  For this portion of the assignment, you will be declaring and instantiating several different arrays.
        You may use any identifier you would like, but they should be meaningful given the context of the problem.
    
        1) Create an array of type int that will be used to store the scores of a student's five assignments.
           You do not need to modify the values of this array after it is instantiated. 
        2) Create an array of type String that will be used to store the names of ten people.
            a) Assign the value "Jill" to the element index position three (3) of the array. 
            b) Assign the value of "Jack" to the ninth (9th) element of the array. 
        3) Create an array of type double that will be used to store the tip amounts earned by a waiter
            a) Explicitly assign the array the following values (in this order) during instantiation:
                * 7.34
                * 4.72
                * 9.32
                * 8.25
        4) Create an array of type boolean that will store responses to a true/false question for 17 people
           An interesting pattern occured with the results where every third person responded true and all others false.
            a) Write a for loop that assigns every third element in the array the value true.
        5) The waiter from part 3 just had a few last minute customers stop. 
            a) Create a new array that has room for an additional two tips.
            b) Copy the values of the first four elements from the array created in step 2 into this array
            c) Assign a value of 1.05 for the tip left by the fifth customer.
            d) Assign a value of 27.32 for the tip left by the last customer.
    
        You may have noticed that the return type for this method is an Object array.
        Return an Object array that includes as elements each of the five arrays you created above. 
        The elements of the array should be placed in the order in which they are created based on the above instructions. 
    */
    public static Object[] Question1()
    {
        //1
        int[] scores = new int[5];
        
        //2
        String[] peopleNames = new String[10];
        peopleNames[3] = "Jill";
        peopleNames[8] = "Jack";
        
        //3
        double[] waiterTips = {7.34, 4.72, 9.32, 8.25};
        
        //4
        boolean[] tFResponses = new boolean[17];
        
        for(int i = 0; i < tFResponses.length - 1; i++)
        {
            if((i + 1) % 3 == 0)
            {
                tFResponses[i] = true;
            }
            else
            {
                tFResponses[i] = false;
            }
        }
        
        //5
        double[] extraTips = new double[waiterTips.length + 2];
        
        for(int i = 0; i < waiterTips.length; i++)
        {
            extraTips[i] = waiterTips[i];
        }
        
        extraTips[4] = 1.05;
        extraTips[5] = 27.32;
        
        //Return
        Object[] fiveArrays = {scores, peopleNames, waiterTips, tFResponses, extraTips};
        
        return fiveArrays;
    }
}
