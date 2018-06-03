
public class Node 
{
	private String name;
	private String matric;
	private int year;
	private Node next;
	
	public Node(String n, String m, int y)
	{
		name = n;
		matric = m;
		year = y;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setMatric(String m) 
	{
		matric = m;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public void setNext(Node n)
	{
		next = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMatric() 
	{
		return matric;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public Node getNext()
	{
		return next;
	}
}
