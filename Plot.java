import java.lang.String;

// Data Element class

public class Plot {
	// Data fields 
	private int x;
	private int y;
	private int width;
	private int depth;
	
	//Constructors
	
	// No-arg constructor
	public Plot ()
	{
		this.x = 0; this.y = 0; this.width = 1;
		this.depth = 1;
		
	}
	// Copy Constructor
	public Plot (Plot p)
	{
		this.x = p.x; this.y = p.y; this.width = p.width;
		this.depth = p.depth;
	}
	// Parameterized Constructor 
	public Plot (int x, int y, int width, int depth) 
	{
		 this.x = x; this.y = y; this.width = width; 
		 this.depth = depth;
	}
	
	public boolean overlaps(Plot plot)
	{
		
	}
	public boolean encompasses(Plot plot)
	{
		
	}
    public void setX(int x)
    {
    	this.x = x;
    }
    public int getX()
    {
    	return x;
    }
    public void setY(int y)
    {
    	this.y = y;
    }
    public int getY()
    {
    	return y;
    }
    public void setDepth(int depth)
    {
    	this.depth = depth;
    }
    public int getDepth()
    {
    	return depth;
    }
//    public String toString()
//    {
//    	String 
//    }
	@Override
	public String toString() {
		return "Upper Left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}
    
    
}
