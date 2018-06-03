
public class Dog extends Animal
{
	private String bark = "Wooouuufff!";
	// Creates empty Animal
	public Dog()
	{
		super();
	}
	
	//Create Animal with age and color
	public Dog(int a, String c)
	{
		super(a, c);
	}
	
	public void Bark()
	{
		System.out.println("Woof, woof!");
		System.out.println(bark);
	}
	
	
}
