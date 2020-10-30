//Made by David Choi and Braxton Brooks
import java.lang.Math;
public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int num, int den) {
		numerator = num;
		denominator = den;
	}
	
	public static void Simplify(int num, int den) {
		int divisor = 0;
		
		for (int i =num; i >= 1; i--) {
			
			if (num % i == 0 && den % i == 0) {
			
			divisor = i;
			break;
		}	
	}
		if (divisor != 0) {
			
			num /= divisor;
			den /= divisor;
			
		}
		System.out.println("it is " + num + "/"+ den);
			
	}
	
	public static void multiplication(int numerator, int denominator, int numerator2, int denominator2) {
	  
		Fraction a = new Fraction(numerator,  denominator); 
		Fraction b = new Fraction(numerator2, denominator2);
	  
	  
		int newNum = numerator * numerator2; 
	  	int newDen = denominator * denominator2;
	  	
	  	int divisor = 0;
		
		for (int i =newNum; i >= 1; i--) {
			
			if (newNum % i == 0 && newDen % i == 0) {
			
			divisor = i;
			break;
		}	
	}
		if (divisor != 0) {
			
			newNum /= divisor;
			newDen /= divisor;
			
		}
	  
	  	System.out.println("Multiplication: " + numerator + "/" + denominator + " * " + numerator2 + "/" + denominator2 + " = " + newNum+"/" + newDen);
	  
	  }
	  
	public static void division(int numerator, int denominator, int numerator2, int denominator2) {
		  
		 Fraction a = new Fraction(numerator,  denominator); 
		 Fraction b = new Fraction(numerator2, denominator2);  
		   
		  
		 int newNum = numerator * denominator2; 
		 int newDen = denominator * numerator2;
		 
		 int divisor = 0;
			
			for (int i =newNum; i >= 1; i--) {
				
				if (newNum % i == 0 && newDen % i == 0) {
				
				divisor = i;
				break;
			}	
		}
			if (divisor != 0) {
				
				newNum /= divisor;
				newDen /= divisor;
				
			}
		 
	  
		 System.out.println("Division: " + numerator + "/" + denominator + " / " + numerator2 + "/" + denominator2 + " = " + newNum+"/" + newDen);
			 
		  }
	 
	public static void addition(int numerator, int denominator, int numerator2, int denominator2) { 
		  
		 Fraction a = new Fraction(numerator,  denominator); 
		 Fraction b = new Fraction(numerator2, denominator2);  
		 
		 int num1 = numerator;
		 int den1 = denominator;
		 int num2 = numerator2;
		 int den2 = denominator2;
		   
		  
		 int newNum = num1 * den2 + num2 * den1; 
		 int newDen = den1 * den2;
		 
		 int divisor = 0;
			
			for (int i =newNum; i >= 1; i--) {
				
				if (newNum % i == 0 && newDen % i == 0) {
				
				divisor = i;
				break;
			}	
		}
			if (divisor != 0) {
				
				newNum /= divisor;
				newDen /= divisor;
				
			}
	  
		 System.out.println("Addition: " + numerator + "/" + denominator + " + " + numerator2 + "/" + denominator2 + " = " + newNum+"/" + newDen);
			 
	}  
	
	public static void subtraction(int numerator, int denominator, int numerator2, int denominator2) { 
		  
		 Fraction a = new Fraction(numerator,  denominator); 
		 Fraction b = new Fraction(numerator2, denominator2);  

		 
		 int num1 = numerator;
		 int den1 = denominator;
		 int num2 = numerator2;
		 int den2 = denominator2;
		   
		  
		 int newNum = num1 * den2 - num2 * den1; 
		 int newDen = den1 * den2;
		 int newDenominator = 0;
		 
		 int divisor = 0;
			
			for (int i =newNum; i >= 1; i--) {
				
				if (newNum % i == 0 && newDen % i == 0) {
				
				divisor = i;
				break;
			}	
		}
			if (divisor != 0) {
				
				newNum /= divisor;
				newDen /= divisor;
				
			}
		 
		 System.out.println("Subtraction: " + numerator + "/" + denominator + " - " + numerator2 + "/" + denominator2 + " = " + newNum+"/" + newDen);
			 
	} 

}
