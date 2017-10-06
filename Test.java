package test;
import dice.Dice;

public class Test {

	public static void main(String[] args) 
	{
		boolean equal = false;
		int diceSum = 0;
//		Make two dies with the facevalues of 3.
		Dice diceA = new Dice(3);
		Dice diceB = new Dice(3);
		
		System.out.println(diceA);
		System.out.println(diceB);
		
		//Set new values for the dies and print the new values
		diceA.setFaceValue(4);
		diceB.setFaceValue(4);
		
		System.out.println(diceA);
		System.out.println(diceB);
		
		equal = diceA.isEqual(diceA, diceB);	
		System.out.println(equal);
		
		diceSum = diceA.getSum(diceA, diceB);
		System.out.println(diceSum);
		
		
		

	}

}
