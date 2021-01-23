
public class NumberMethod {
	public static boolean isPrime(int n) {
		boolean prime = true;	
		
		   for(int i=2;i<n;i++){      
		    if(n%i==0 || n == 0 || n ==1){
		     prime = false;	
		     break;      
		    }  
		    else {
		    	prime = true;
		    }
		   }   
		  return prime;
		}    

	public static int divisorSum(int n) {
		int sum = 0;
		
		
		for(int i = 1; i <n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static boolean isStrong(int n) { 
		boolean strong = false;
		if(n > divisorSum(n) && isPrime(n) == false) {
			strong = true;
		}
		else if(n < divisorSum(n) && isPrime(n) == false) {
			strong = false;
		}
		
		return strong;
	} 
	public static void printDivisors(int n) {
		String  list = "";	
		
		for(int i = 1; i < n; i++) {
			if(n%i == 0) {
				list = list + i + " ";
			}
		}
		System.out.println(list);
	}
	
	 
	public static void printPrimes(int n) {
			int i =0;
	       String  list = "";	 

	       for (i=2; i<n; i++) {
	    	   if(isPrime(i) == true) {
	    	   list = list + i + " ";
	    	   } 
	        }
	       
	       System.out.println(list);
		

}
	
	public static void printComposites(int n) {
			int i =0;
	       String  list = "";	 

	       for (i=1; i<n; i++) {
	    	   if(isPrime(i) == false) {
	    	   list = list + i + " ";
	    	   }
	        }
	       
	       System.out.println(list);
		
		
	}
	public static void printStrong(int n) {
		int i =0; 
	       String  list = "";	 

	       for (i=1; i<n; i++) {
	    	   if(isStrong(i) == true) {
	    	   list = list + i + " ";
	    	   }
	        }
	       
	       System.out.println(list);
		
	}
	
	public static void printWeak(int n) {
		int i =0;
	       String  list = "";	 

	       for (i=1; i<n; i++) {
	    	   if(isStrong(i) == false && isPrime(i) == false) {
	    	   list = list + i + " ";
	    	   }
	        }
	       
	       System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		printComposites(30);
		printPrimes(30);
		printStrong(30); //In the instructions, the list does not include 25 26 or 27, even though these numbers should be considered strong
		printWeak(30);
	}
} 