import java.util.Scanner;

/**
 * This is a class that introduces functions that we can use on strings.
 * 
 * @author Akai
 *@date 1/28/2018
 */

public class StringIntro 
{
	public static void main(String[] args) 
	{
		String hello = "Hello, world";
		String test = "This is a test.";
		
		System.out.println(hello);
		System.out.println(test);
		System.out.println(hello + " " + test);
		
		System.out.println(hello.equals(test));
		System.out.println(hello.equals("Hello, world"));
		
		//String sub = hello.substring(0, 5).toLowerCase();
		String sub = hello.substring(0, 5).toUpperCase(); 
		
		System.out.println(sub);
	}

}
