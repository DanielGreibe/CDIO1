package dice;
/**
 * 
 */

/**
 * @author Daniel Greibe
 *
 */
public class Dice 
{
	//Data describing the dice.
	private final int MAX = 6;	//Highest allowed eye value
	private int faceValue = 0;	//Current eye value
	private int DiceSum = 0;
	private boolean equal;
	

	//Class constructor
	public Dice(int f)
	{
		//Startvalue of a Dice is set to the value of f.
		faceValue = f;
	}
	//Set faceValue to a random value between 1 and 6.
	public int roll()
	{
		faceValue = (int)(Math.random() * MAX)+1;
		return faceValue;
	}
	
	//Set faceValue to a given value.
	public void setFaceValue (int value)
	{
		//Check at den nye værdi er lovlig
		if (value >=1 && value <= MAX)
		faceValue = value;
	}
	
	//Returns the value of faceValue.
	public int getFaceValue()
	{
		return faceValue;
	}
	
	//Converts the value of faceValue to the type String.
	public String toString()
	{
		String result = "Eyes: " + faceValue;
		return result;
	}
	public int getSum(Dice diceA, Dice diceB) //Returns the sum of dice A and B.
	{
		DiceSum = diceA.getFaceValue() + diceB.getFaceValue();
		return DiceSum;
	}
	public boolean isEqual(Dice diceA, Dice diceB) //Compare dice values of dice A and B.
	{
		if (diceA.getFaceValue() == diceB.getFaceValue())
		{
			equal = true;
		}
		else
		{
			equal = false;
		}
		return equal;
	}

}
