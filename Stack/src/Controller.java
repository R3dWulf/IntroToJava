import java.util.Scanner;

public class Controller {
	Stack customers = new Stack();
		
	
	public static void main(String[] args)
	{
		Controller c = new Controller();
		c.runMenu();
	}

		private String askInput()
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("\n-------------------------------");
			System.out.println("Press A to add customer");
			System.out.println("Press R to remove customer");
			System.out.println("Press F to find customer");
			System.out.println("Press Q to quit");
			System.out.println("Enter your choice: ");
			String input = scan.nextLine();
			return input;
		}
	
	public void runMenu()
	{
		String input = askInput();
		
		while(!input.equals("q"))
		{
			if(input.equals("a"))
			{
				askNode();
			}
			else if(input.equals("r"))
			{
				forwardPerson();
			}
			else if(input.equals("f"))
			{
				find();
			}
			else
			{
				System.out.println("Unkown command...");
			}
			input = askInput();
		}
	}
		
		public void askNode()
		{
			/*
			 * 1. Ask the user for customer details
			 * 2. Create a new Node with them
			 * 3. Give this Node to the Stacks's push(Node) method
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("\n**************************");
			System.out.print("enter the customer name: " );
			String name = scan.nextLine();
			System.out.print("Enter the customer phone number:  ");
			String phone = scan.nextLine();
			scan.nextLine();
			Node newOne = new Node(name, phone);
			customers.push(newOne);
		}
		
		public void forwardPerson()
		{
			Node popped = customers.pop();
			if(popped != null)
			{
				System.out.println("\n**************************");
				System.out.println("This customer moves forward...");
				System.out.println("\n");
				printDetails(popped);
			}
			else
			{
				System.out.println("No node removed");
			}
		}
		
		public void find()
		{
			/*
			 *1. Ask the user for the name of the customer
			 *2. Call the Queue's  find(String) method with this name 
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("\n**************************");
			System.out.print("Enter the cusomer's name to find: " );
			
			String name = scan.nextLine();
			
			Node found = customers.find(name);
			if(found != null)
			{
				printDetails(found);
			}
			else
			{
				System.out.println("\n**************************");
				System.out.println("Node was not found!");
			}
		}
		
		private void printDetails(Node n)
		{
			System.out.println("Name: " + n.getName());
			System.out.println("Phone number: " + n.getPhone());
			if(n.getNext() != null)
			{
				System.out.println("Next node: " + n.getNext().getName());
			}
			
		}
}
