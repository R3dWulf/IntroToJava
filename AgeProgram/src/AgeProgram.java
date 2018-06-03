import java.util.Scanner;

/**
 * This class interacts with the user to tell them their age in months, days and minutes
 * 
 * @author Akai
 * @date 1/29/2018
 *
 */
public class AgeProgram 
{
	public static void main(String[] args) {
		/**
		 * 1. Ask user for their age
		 * 2. Read their age with a Scanner
		 * 3. Calculate months, days, and minutes
		 * 4. Print out the details
		 */
		
		// 1. Ask user for their age
		System.out.print("Enter your age: ");
		
		// 2. Read their age with a Scanner
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		// 3. Calculate months, days, and minutes
		int months = age * 12;
		int days = age * 365;
		int minutes = days * 24 * 60; 
		
		//  4. Print out the details
		System.out.println("You are " + months + " months old or " + days + " days old or " + minutes + " minutes old");
		
	}
}
