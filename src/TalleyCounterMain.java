/**
 * 
 * @author Philip Wellener
 *
 */

public class TalleyCounterMain 
{

	public static void main(String[] args) 
	{
		TalleyCounter counter1 = new TalleyCounter();
		TalleyCounter counter2 = new TalleyCounter(100);
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		counter1.click();
		counter1.click();
		counter1.click();
		System.out.println(counter1.getCount());
		counter1.reset();
		System.out.println(counter1.getCount());
		System.out.println(counter2.toString());

	}

}
