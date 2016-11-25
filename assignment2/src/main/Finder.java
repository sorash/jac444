package main;

public class Finder 
{
	/**
	 * Finds maximum value tag in the given values.
	 * @param input values to check through
	 * @return highest value found
	 */
    public static int findMaximumValueTag(int[] input) 
    {
    	int max = input[0];
        
        for(int i = 0; i < input.length; i++)
        {
     	   if(input[i] > max)
     		   max = input[i];
        }
        
        return max;
    }
}
