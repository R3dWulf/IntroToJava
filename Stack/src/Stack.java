
public class Stack {
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
	
	public void push(Node newOne)
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
	
	public Node pop()
	{
		/*
		 * Make the head poin to the second element (or null)
		 */
		if(head != null)
		{
			Node toReturn = head;
			head = head.getNext();
			return toReturn;
		}
		return null;
	}
}
