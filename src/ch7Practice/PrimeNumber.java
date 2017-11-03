package ch7Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Prime numbers of 10 to 100");
		
		for(int a=10; a<=100; a++){
				
			if ( (a%2 != 0) && (a%3 != 0) && (a%5 != 0) && (a%7 != 0)){
				
				System.out.println(a);
				
			}
			
		}
		
	}

}
