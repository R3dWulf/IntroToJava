import java.util.Scanner;

public class Controller 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to our DVD store");
		Controller c = new Controller();
		Store store = new Store();
		
		Scanner scan = new Scanner(System.in);
		Scanner doubleScanner = new Scanner(System.in);
		
		int input = -1; 
		
		while(input != 0)
		{
			input = c.displayMenu();
			if(input == 1)
			{
				// display all DVDs
				store.listDVDs();
			}
			else if (input == 2)
			{
				// Rent a DVD ( ask user for the name of the DVD to rent)
				String name = scan.nextLine();
				System.out.println("Enter the DVD name to rent: ");
				store.rentDVD(name);
			}
			else if(input == 3)
			{
				// Add a DVD
				System.out.println("Enter the DVD name to add: ");
				String name = scan.nextLine();
				System.out.println("Enter the cost of the DVD: ");
				double cost = doubleScanner.nextDouble();
				store.addDVD(name, cost);
			}
		}
	}
	
	private int displayMenu()
	{
		System.out.println("\nPress 1 to display all available DVDs");
		System.out.println("Press 2 to rent a DVD");
		System.out.println("Press 3 to add a DVD");
		System.out.println("Press 0 to exit");
		System.out.println("Enter your choice: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}

}
