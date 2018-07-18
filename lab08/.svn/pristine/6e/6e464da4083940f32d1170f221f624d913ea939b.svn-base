/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Chapter8;

/**
 *
 * @author araderma
 */
public class Question2 {
    
    public static Object[] Question2(double[] input)
    {
        /**
         *  For this part of the assignment you will be doing simple array
         *   processing on an array of type double with the identifier input
         *   that is being passed as a parameter to this method. 
         * 
         *  You should calculate and return the following values as elements of
         *   an array of type Object in the following order:
         * 
         *  1) An int value representing the count (number of elements in the input array)
         *  2) A double value representing the sum (total of elements in the input array)
         *  3) A double value representing the value of the smallest element in the input array
         *      *Note: If there are no elements, return the special value Double.NaN
         *  4) A double value representing the value of the largest element in the input array
         *      *Note: If there are no elements, return the special value Double.NaN
         */
        
        // Process the array called input here
        //1
        int count = input.length;
        
        //2
        double sum = 0;
        
        for(int i = 0; i < input.length; i++)
        {
            sum += input[i];
        }
        
        //3
        double min = 0;
        
        if(count == 0)
        {
            min = Double.NaN;
        }
        
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] < min)
            {
                min = input[i];
            }
        }

        //4
        double max = 0;
        
        if(count == 0)
        {
            max = Double.NaN;
        }
        
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] > max)
            {
                max = input[i];
            }
            
            
        }
        
        
        // Create your Object[] storing the count, sum, min, and max here and return it
        Object[] returnArrayInfo = {count, sum, min, max};
        return returnArrayInfo;
                
    }
    
}
