import java.lang.String;

public class Property {
	
	// Data fields
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	// Constructors
	
	// No-arg Constructor
	public Property()
	{
		this.plot = new Plot();
		this.city = "";
		this.owner = "";
		this.propertyName = "";
		this.rentAmount = 0;
		
	}
	
	// Copy constructor 
	public Property( Property p)
	{
		this.plot = new Plot(p.plot); this.city = p.city;
		this.owner = p.owner; this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
	}
	
	// Parameterized Constructor 
	public Property (String propertyName,String city, double rentAmount,String owner)
	{
		this.plot = new Plot();
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount  = rentAmount;
		this.owner = owner;		
	}
	public Property(String propertyName,String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.plot = new Plot (x,y,width,depth);
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount  = rentAmount;
		this.owner = owner;	
		
	}
	
	/**
	   * @return city
	   */
	
	public String getCity()
	{
		return city;
	}
	public String getOwner()
	{
		return owner;
		
	}
	public Plot getPlot()
	{
		return plot;
	}
	public String getPropertyName()
	{
		return propertyName;
	}
	public double getRentAmount()
	{
		return rentAmount;
		
	}
	public void setPlot(int x, int y, int width, int depth)
	{
		this.plot = new Plot(x, y, width, depth);
		
		 
	}
    public void setCity(String city)
    {
    	 this.city = city;
    }
     
    public void setOwner(String owner)
    {
    	 this.owner = owner;
    }
     
    public void setPropertyName(String propertyName)
    {
    	 this.propertyName = propertyName;
    }
     
    public void setRentAmount(double rentAmount)
    {
    	this.rentAmount = rentAmount; 
    }
    public String toString() {

    	String propertyString = "";

    	propertyString += "Property Name: " + propertyName + "\nLocated in " + city +

    	"\nBelonging to: " + owner + "\nRent Amount: " + rentAmount;

    	return propertyString;

    	}
	

}
