
public class Dog 
{
	private String color;
	private int age;
	private String food;
	
	public Dog(String inputFood, int inputAge)
	{
		// Constructor - runs when the object is created
		food = inputFood;
		age = inputAge;
	}
	
	public void bark()
	{
		barkOnce();
		barkOnce();
	}
	
	public void eat()
	{
		System.out.println("I'm eating " + food);
	}
	
	public void barkOnce()
	{
		System.out.println("Woof!");
	}
	
	public int getAge()
	{
		return age;
	}
}
