
public class Queue {
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
	
	public void pop()
	{
		// The last element points to null
		//We have to make its parent point to null instead of the node
		/*
		 * Go through the list
		 * If the next node is going to be the last element
		 * remove if from the queue
		 */
		Node marker = head; // marker starts at the begining
		while(marker != null)
		{
			Node child = marker.getNext();
			if(child != null)
			{
				if(child.getNext() == null)
				{
					//Child is the last node
					marker.setNext(null); // set head to null to remove the child from the queue
				}
			}
			marker = marker.getNext();
		}
	}
}
