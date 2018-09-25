/**
 * 
 * @author Philip Wellener
 *
 */

public class TalleyCounter 
{
	// Instance Variables
	
	private int count;
	
	// Constructor
	
	public TalleyCounter ()
	{
		count = 0;
	}
	
	public TalleyCounter (int startNum)
	{
		count = startNum;
		
	}
	
	public void click()
	{
		count = count + 1;
		//count++;
		//count+=1;
	}
}
