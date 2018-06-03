import java.util.Scanner;

public class Controller {

	Queue customers = new Queue();
		
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
			 * 3. Give this Node to the Queue's push method
			 */
			Scanner scan = new Scanner(System.in);
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
			customers.pop();
		}
		
		public void find()
		{
			/*
			 *1. Ask the user for the name of the customer
			 *2. Call the Queue's  find(String) method with this name 
			 */
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the cusomer's name to find: " );
			
			String name = scan.nextLine();
			
			Node found = customers.find(name);
			if(found != null)
			{
				printDetails(found);
			}
			else
			{
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
