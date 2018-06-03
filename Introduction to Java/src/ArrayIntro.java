import java.util.Scanner;

/**
 * This class introduces basic how-to-dos for arrays.
 * 
 * @author Akai
 *@date 1/29/2018
 */

public class ArrayIntro 
{
	public static void main(String[] args) 
	{
		int[] intArray = {1,2,3,4,5};
		int[] sizesArray = new int[5]; // same as {0,0,0,0,0}; 
		
		String[] stringArray = {"hello", "bye", "something"};
		String[] phrases = new String[3];  // same as {null, null, null}
		
		System.out.println(stringArray[0]);
		System.out.println(intArray[3]);
		System.out.println(sizesArray[3]); // displays 0, but sometimes will display nothing at all or the word null, depending on the editor in use
		
		if(phrases[1]  != null)
		{
			System.out.println(phrases[2]);
		} else
		{
			System.out.println("phrases array is null");
		}
		
		phrases[2] = "I'm not null!!!";
		
		if(phrases[2] != null)
		{
			System.out.println(phrases[2]);
		}
		
		for(int i =0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
		
		for(int j = 0; j  < stringArray.length; j++)
		{
			System.out.println(stringArray[j]);
		}
		
	}

}
