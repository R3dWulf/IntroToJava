
public class List
{
	private Node head;
	
	public List(Node h)
	{
		head = h;
	}
	
	public void setHead(Node h)
	{
		head = h;
	}
	
	public Node getHead() 
	{
		return head;
	}
	
	public void addToList(Node newOne)
	{
		if(head == null)
		{
			head = newOne;
		}
		else 
		{
			newOne .setNext(head);
			head = newOne;
		}
	}
	
	public Node find(String name)
	{
		Node marker = head;
		while(marker != null)
		{
			if(marker.getName().equals(name))
			{
				return marker;
			}
			marker = marker.getNext();
		}
		return null;
	}
}
