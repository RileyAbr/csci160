package Questions.Chapter8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riley
 */
public class ArrayUtilities {
    
    public static boolean arraysAreEqual(int[] array1, int[] array2)
    {
        boolean areEqual = true;
        
        if(array1.length != array2.length)
        {
            areEqual = false;
        }
        else
        {
            if(array1.length == 0 && array2.length == 0)
            {
                areEqual = true;
            }
            else
            {
                for(int i = 0; i < array1.length; i++)
                {
                    if(array1[i] != (array2[i]))
                    {
                        areEqual = false;
                    }

                }
            }
        }
        
        return areEqual;
    }
    
    private static int[] resizeArray(int[] array, int factor)
    {
        int newLength = array.length * factor;
        int[] newArray = new int[newLength];
        
        for(int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }
            
        return newArray;
    }
    
    public static int[] resizeArray(int[] array)
    {
        return resizeArray(array, 2);   
    }
    
    public static int[] copyArray(int[] array)
    {
        return resizeArray(array, 1);
    }
}

