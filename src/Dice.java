//Constructor created

public class Dice {
	
	private int lowNum;
	private int highNum;
	
	
	public Dice (int low, int high)
	{
		lowNum = low;
		highNum = high;
	}
	
	
	
public int GetANumber()
	
	{
		
		int gameNum = 0 + (int)(Math.random()*highNum);
		return gameNum;
	}
	
}

