import java.util.Scanner;

/**
 * This class introduces the concept of a while loop in Java
 * 
 * @author Akai
 * @date 1/28/2018
 *
 */
public class WhileLoop 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a value and Java will write 'Hello' this many times");
		int input = scan.nextInt();
		
		int index = 0;
		
		while(index < input)
		{
			System.out.println(index);
			index++;
		}
	}

}
