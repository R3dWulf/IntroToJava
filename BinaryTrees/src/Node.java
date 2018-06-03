
public class Node {
	private String name;
	private String phone;
	private int id;
	private Node left; 
	private Node right;
	
	public Node(String n, String p, int i)
	{
		name = n;
		phone = p;
		id = i;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setPhone(String p) 
	{
		phone = p;
	}
	
	public void setLeft(Node n)
	{
		left = n;
	}
	
	public void setRight(Node n)
	{
		right = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPhone() 
	{
		return phone;
	}
	

	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setID(int i)
	{
		id = i;
	}
	
	public int getChildren()
	{
		if(left != null && right != null)
		{
			return 2;
		}
		else if (left != null || right != null)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}
}
