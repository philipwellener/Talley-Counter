/**
 * 
 * @author Philip Wellener
 * Period 7
 * AP Comp Sci
 *
 */

public class TalleyCounter
{
	// Instance Variables
	private int count;
	

	// Constructor
	public TalleyCounter()
	{
		count = 0;
		
	}
	
	public TalleyCounter(int startNum)
	{
		count = startNum;
		
	}

	public void click()
	{
		count = count + 1;
		//count++; count=count+1
		//count+=1; count=count+1
	}
	
	public void reset()
	{
		count = 0;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void unClick()
	{
		count = count - 1;
				
	}
}