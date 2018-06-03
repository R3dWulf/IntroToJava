import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store 
{
	List<DVD> dvds;
	double money;
	
	public Store() 
	{
		dvds = new ArrayList<DVD>();
		dvds.add(new DVD("The Matrix", 15.00, true));
		dvds.add(new DVD("Frozen", 13.00, true));
		
	}
	
	public void listDVDs()
	{
		Iterator itr = dvds.iterator();
		while( itr.hasNext())
		{
			DVD dvd = (DVD)itr.next();
			System.out.println( dvd.getName() + ",\tPrice: " + dvd.getCost() + ",\tIs Available: " + dvd.isAvailable() );
		}
	}
	
	public boolean rentDVD(String name)
	{
		Iterator itr = dvds.iterator();
		while( itr.hasNext())
		{
			DVD dvd = (DVD)itr.next();
			if(dvd.getName().equals(name))
			{
				if(dvd.isAvailable()) 
				{
					// Rent
					this.money += dvd.getCost();
					dvd.rent();
					System.out.println("The DVD was rented. \n");
					return true;
				}
				else
				{
					// Cannot Rent
					System.out.println("DVD is already taken");
					return false;
				}
			}
		}
		System.out.println("DVD is not in our list.");
		return false;
	}
	
	public void addDVD(String name, double cost)
	{
		dvds.add(new DVD(name, cost, true));
	}
}
