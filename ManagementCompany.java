import java.lang.String;
import java.util.Arrays;

public class ManagementCompany {
	
	// Data fields
	private  int	MAX_PROPERTY = 5;
	private  double	mgmFeePer;
    private  String	name;
    private  Property[]	properties = new Property[MAX_PROPERTY];
    private  String	taxID;
    private  int MGMT_WIDTH = 10;
    private  int MGMT_DEPTH = 10;
    private  Plot plot = new Plot ();
    
    // Constructors 
    public ManagementCompany ()
    {
    	this.plot = new Plot();
    	this.name = "";
    	this.taxID = "";
    	this.mgmFeePer = 0;
    	this.properties = new Property[MAX_PROPERTY];
    	
    }
    public ManagementCompany(String name, String taxID, double mgmFeePer)
    {
        
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
    }
    
    public ManagementCompany(String name, String taxID, double mgmFeePer,int x, int y, int width, int depth) 
    {
	    this.plot = new Plot(x,y,width,depth);
	    this.name = name;
        this.taxID = taxID;
    	this.mgmFeePer = mgmFeePer;
    	this.properties = new Property[MAX_PROPERTY];
   }
    
   public ManagementCompany(ManagementCompany otherCompany)
   {
	   this.plot = new Plot(otherCompany.plot);
	   this.name = otherCompany.name;
	   this.taxID = otherCompany.taxID; 
	   this.mgmFeePer = otherCompany.mgmFeePer;
	   this.properties = new Property[MAX_PROPERTY];
   }
   
   public  int	addProperty(Property property)
   {
    	int value = 0;
    	if (properties.length == 5)
    	{
    		value = -1;
    		
    	}
    	else if (property == null)
    	{
    		value = -2;
    	}
    	else if (property.getPlot().encompasses(plot))
    	{
    		value = -3;
    	}
    	else if (property.getPlot().overlaps(plot))
    	{
    		value = -4;
    	}
    	for (int i = 0; i < properties.length; i++)
    	{
    		if (properties[i] == null)
    		{
    			properties [i] = property;
    			value = i;
    			break;
    		}
    	}
    	return value;
   }
   public int	addProperty(String name,String city,double rent,String owner)
   {
	   return addProperty(new Property(name, city, rent, owner));
   }
   
   public int addProperty( String name, String city, double rent, String owner, int x, int y, int width, int depth)
   {
	   return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
	   
   }
   
   public String displayPropertyAtIndex(int i)
   {
	   return properties[i].toString();
	   
   }
   
   public int	getMAX_PROPERTY()
   {
	   return MAX_PROPERTY;
   }
   
   public double maxRentProp()
   {
	   double maximumRent = 0.0;
	   for (int i = 0; i < properties.length; i++)
	   {
		   if (properties[i] == null)
		   {
			   break;
		   }
		   if (properties[i].getRentAmount()> maximumRent)
		   {
			  maximumRent = properties[i].getRentAmount();
		   }
	   }
	   return maximumRent;
	   
   }
   public int maxRentPropertyIndex()
   {
	   
	   double maximumRent = 0.0;
	   int index = -1;
	   for (int i = 0; i < properties.length; i++ )
	   {
		   if(properties[i].getRentAmount() > maximumRent)
		   {
			   maximumRent = properties[i].getRentAmount();
			   index = i;
		   }
	   }
	   return index;
   }
   
   public double totalRent()
   {
	   double total = 0.0;
	   for(int i = 0; i < properties.length; i++)
	   {
		   if (properties[i] == null)
		   {
			   break;
		   }
		   total += properties[i].getRentAmount();
		   
	   }
	   
	   return total;
   }
      public void setPlot(int x, int y, int width, int depth) 
      {

	   this.plot = new Plot(x, y, width, depth);

	  }

	   public Plot getPlot()
	   {

	   return plot;

	   }

	   public String getName()
	   {

	   return name;

	   }

	   /**

	   * @param name the name of the owner to set

	   */

	   public void setName(String name) {

	   this.name = name;

	   }
	   
	   @Override
	    public String toString() 
	   {
		   String managementCompanyString = "";

		   managementCompanyString += "List of the properties for " + name + ", taxID: " + taxID;

		   managementCompanyString += "\n________________________________________________________________";

		   for (Property p : properties) {

		   managementCompanyString += "\nProperty Name: " + p.getPropertyName() + "\nLocated in "

		   + p.getCity() + "\nBelonging to: " + p.getOwner() + "\nRent Amount: " + p.getRentAmount();

		   }

		   managementCompanyString += "\n_________________________________________________________________";

		   managementCompanyString += "\ntotal management Fee: " + totalRent();

		   return managementCompanyString;

	   }
}

	   