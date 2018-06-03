
public class Animal 
{
	protected int age;
	protected String color;
	
	public Animal()
	{
		
	}
	
	public Animal(int a, String c)
	{
		age = a;
		color = c;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setColor(String c)
	{
		color = c;
	}
}
