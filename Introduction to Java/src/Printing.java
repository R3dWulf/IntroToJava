import java.util.Scanner;

public class Printing 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What food does Charlie like to eat?");
		String charlieFood = scan.nextLine();
		System.out.println("What is Charlie's age?");
		int charlieInputAge = scan.nextInt();
		scan.nextLine(); // leaving this out will cause the enter button to be inputed for the value of what Rosco likes to eat
		
		System.out.println("What food does Rosco like to eat?");
		String roscoFood = scan.nextLine();
		System.out.println("What is Rosco's age?");
		int roscoInputAge = scan.nextInt();
		
		Dog charlie = new Dog(charlieFood, charlieInputAge);
		charlie.bark();
		int charlieAge = charlie.getAge();
		System.out.println("Charlie's favorite food is " + charlieFood);
		System.out.println("Charlie's age is: " + charlieAge); 
		
		
		Dog rosco = new Dog(roscoFood, roscoInputAge);
		System.out.print("Rosco, what are you eating? "); 
		rosco.eat();
		int roscoAge =  rosco.getAge();
		System.out.println("Roscos is " + roscoAge + " years old");
		
		Dog fluffy = new Dog("paper", 1);
		System.out.print("Fluffy, what are you eating? ");
		fluffy.eat();
		int fluffyAge = fluffy.getAge();
		System.out.println("Fluffy is " + fluffyAge + " years old");
	}
}
