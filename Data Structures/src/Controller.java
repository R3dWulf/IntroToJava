import java.util.Scanner;

public class Controller 
{
	
	private List list;
	
	public static void main(String[] args)
	{
		Controller c = new Controller();
		c.askNode();
		//c.askNode();
		//c.askNode();
		c.find();
	}
	
	public Controller()
	{
		list = new List(null);
	}
	
	public void askNode()
	{
		/*
		 * 1. Ask the user for student details
		 * 2. Create a new Node with them
		 * 3. Give this Node to the Lists' addToList(Node) method
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the student name: " );
		String name = scan.nextLine();
		System.out.print("Enter the student matriculation number:  ");
		String matric = scan.nextLine();
		System.out.print("Enter the student year: ");
		int year = scan.nextInt();
		scan.nextLine();
		
		Node newOne = new Node(name, matric, year);
		list.addToList(newOne);
		
	}
		public void find()
		{
			/*
			 *1. Ask the user for the name of the student
			 *2. Call the lists' find(String) method with this name 
			 */
			Scanner scan = new Scanner(System.in);
			System.out.print("enter the student name to find: " );
			
			String name = scan.nextLine();
			
			Node found = list.find(name);
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
			System.out.println("Matriculation number: " + n.getMatric());
			System.out.println("Year: " + n.getYear());
			if(n.getNext() != null)
			{
				System.out.println("Next node: " + n.getNext().getName());
			}
			
		}
	
}
