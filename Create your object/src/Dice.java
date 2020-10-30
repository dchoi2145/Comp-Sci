
public class Dice {
	private int sides;
	private int dice1;
	private int dice2;
	
	public Dice(int numOfSides) {
		sides = numOfSides;
		dice1 = (int)(Math.random()*numOfSides) + 1; 
		dice2 = (int)(Math.random()*numOfSides) + 1;
	}
	
	public void getDiceVal() {
		System.out.println("Dice 1 value: " + dice1);
		System.out.println("Dice 2 value: " + dice2);
	}
	
	public void sumOfDice() {
		int x = dice1 + dice2;
		System.out.println("The sum of both dices is: " + x);
	}
	
	public void sideVal() {
		System.out.println("Number of sides: " + sides);
	}
	
	public void rollResult()  {
		getDiceVal();
		sideVal();
		sumOfDice();
	}
	
}
