// IMPORTS
import java.util.Scanner;

/**
 * This class compares a number that the user inputs to another number.
 * Then it tells whether the input number is greater than, equal to, or smaller than 
 * 		the number the user has inputed.
 * 
 * @author Akai
 * @date 1/28/2018
 *
 */

public class Comparison 
{
	public static void main(String[] args) 
	{
		//Create Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Ask the user for a number
		System.out.print("Enter a number: ");
		
		// Assign this number to a variable
		int num = scan.nextInt();
		
		//System.out.println(num);
		
		// Check if the number is less than 10
		
		if(num < 10)
		{
			System.out.println(num + " is less than 10");
		} else if (num > 10)
		{
			System.out.println(num + " is greater than 10");
		} else 
		{
			System.out.println(num + " is equal to 10");
		}
		
	}

}
