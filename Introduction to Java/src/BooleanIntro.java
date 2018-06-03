import java.util.Scanner;

/**
 * This is a class that intros how to do booleans in Java
 * @author Akai
 *@date 1/28/2019
 */

public class BooleanIntro 
{
	public static void main(String[] args) 
	{
		boolean bol1 = true;
		boolean bol2 = false;
	
		System.out.println(bol1);
		System.out.println(bol2);

		
	
		while(bol1 || bol2 && (bol1 || bol2))
		{
			System.out.println("World"); // while ( false and false ) displays nothing
		}
	}

}
