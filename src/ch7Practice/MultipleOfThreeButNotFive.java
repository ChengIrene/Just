package ch7Practice;

public class MultipleOfThreeButNotFive {

	public static void main(String[] args) {

      System.out.println("The numbers 1~100 are multiples of three but not multiples of five.");    
      
      int sum1 = 0;
      int sum2 = 0;
      
        for(int a=1; a<= 100; a++){
        	
        	if( a%3 == 0 && a%5 != 0){
        		
        		System.out.println(a);
        		
        		sum1 = sum1 + a;
        		sum2 = sum2 + (a-1);
        		
        	}
        	
        }

        System.out.println( "The total number : " + (sum1 - sum2) );
        
	}
	
}
