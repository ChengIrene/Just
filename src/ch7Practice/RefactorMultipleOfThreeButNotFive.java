package ch7Practice;

public class RefactorMultipleOfThreeButNotFive {

	public static void main(String[] args) {
		
		System.out.println("The numbers 1~100 are multiples of three but not multiples of five.");    
	      
		    int count = 0;
	      
	        for(int a=1; a<= 100; a++){
	        	
	        	if( a%3 == 0 && a%5 != 0){
	        		
	        		System.out.println(a);
	        		
	        		count++;
	        		
	        	}
	        }
	        
	        System.out.println( "The total number : " + count );      
	}
}
