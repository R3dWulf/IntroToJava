import java.util.Scanner;

/**
 * This class introduces how to do for loops in Java
 * 
 * @author Akai
 *@date 1/28/2018
 */

public class ForLoop 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number up to which we will count: ");
		
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			System.out.println(i);
		}
	}

}
