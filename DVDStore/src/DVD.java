
public class DVD {
	private String name;
	private double cost;
	private boolean available;
	
	public DVD(String name, double cost, boolean available) 
	{
		this.name = name;
		this.cost = cost;
		this.available = available;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getCost()
	{
		return this.cost;
	}
	
	public boolean isAvailable()
	{
		return this.available;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public void rent()
	{
		this.available = false;
	}
	
	public void returnDVD()
	{
		this.available = true;
	}
}
