/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television
{

	private final String MANUFACTURER; // This field represents the name television manufacturer brand.
	private final int SCREEN_SIZE; // This field represents the size of the television screen.
	private boolean powerOn;// This field represents the the value true if the power is on, and false if the power is off.
	private int channel; // This field represents the value of the station that the television is showing.
	private int volume; // This field represents a number value representing the loudness (0 being no sound).
	
	// This constructor is a parameterized constructor that 
	public Television(String MANUFACTURER, int SCREEN_SIZE )
	{
		this.MANUFACTURER = MANUFACTURER;
		this.SCREEN_SIZE = SCREEN_SIZE;
		powerOn = false;
		volume = 20;
		channel = 2;
		
	}
	
	/**
	   * Returns a number value representing the loudness (0 being no sound).
	   * 
	   * @return the value of the volume field
	   */
	public int getVolume()
	{
		return volume;
	}
	
	/**
	   * Returns a number value representing the value of the station that the television is showing.
	   * 
	   * @return the value of the channel field 
	   */
	public int getChannel()
	{
		return channel;
	}
	
	/**
	   * Returns a String value representing the name television manufacturer brand.
	   * 
	   * @return the value of the MANUFACTURER field 
	   */
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	/**
	   * Returns a number value representing the size of the television screen.
	   * 
	   * 
	   * @return the value of the SCREEN_SIZE field
	   */
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	/**
       * The setChannel method will store the desired station in the channel field.	   * 
	   * @param station an int variable that accepts the value stores in the channel field
	   */
	public void setChannel(int station)
	{
		this.channel = station;
	}
	
	/**
	   * Changes the value of the powerOn field and stores it back in the field
	   */
	public void power()
	{
		powerOn = !powerOn;
	}
	
	/**
	   * The increaseVolume method will increase the value stored in the volume field by 1.
	   * 
	   * 
	   */
	public void increaseVolume()
	{
		volume += 1;
	}
	
	/**
       * The decreaseVolume method will decrease the value stored in the volume field by 1.
	   * 
	   * 
	   */
	public void decreaseVolume()
	{
		volume -=1;
	}
	
}
