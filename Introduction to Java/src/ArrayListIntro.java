import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * This class introduces the concepts of ArrayLists
 * 
 * @author Akai
 *@date 1/29/2018
 */

public class ArrayListIntro 
{
	public static void main(String[] args) 
	{
		List<String> phrases = new ArrayList<String>();
		phrases.add("Hello");
		phrases.add("Bye");
		phrases.add("Something else");
		System.out.println("the size of the array before the removal is: " + phrases.size());
		
		//List<String> phrases2 = new ArrayList<String>();
		//phrases2.add("Pizza");
		//phrases2.add("Taco");
		//phrases2.add("hamburger");
		
		//List<Integer> numbers = new ArrayList<Integer>();
		//numbers.add(5);
		//numbers.add(10);
		//numbers.add(13);
		
		//System.out.println(phrases);
		//System.out.println(numbers);
		
		//System.out.println(phrases.get(0) + phrases.get(1) + phrases.get(2) );
		
		//phrases.addAll(phrases2);
		
		//System.out.println(phrases);
		
		//System.out.println(phrases2.isEmpty());
		
		Iterator itr = phrases.iterator();
		while(itr.hasNext())
		{
			String str = (String)itr.next();
			//System.out.println(str);
			if(str.equals("Bye"))
			{
				itr.remove();
			}
			else
			{
				System.out.println(str);
			}
		}
		
		System.out.println("The size of the array after the removal is: " + phrases.size());
		
	}

}
