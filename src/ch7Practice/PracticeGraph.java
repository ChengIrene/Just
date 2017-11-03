package ch7Practice;

public class PracticeGraph {

	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++){
			
			for(int b=1; b<=5; b++){
				
			   System.out.print("* ");
			 
			}
			
			System.out.println("");
			
		}
		
		int c, d, Line = 5;
		 
		  for (c = 0; c < Line; c++) {
			  
		    for (d = 0; d <= c; d++) {
		    	
		      System.out.print("");
		      
		    }
		    
		    for (d = (((Line - c) * 2) - 1); d >= 1; d--) {
		    	
		      System.out.print("*");
		      
		    }
		    
		      System.out.println();
		    
		  }
		  
		  int i, k, Line2 = 5;
		  
		  for (i = 0; i < Line2; i++) {
			  
		    for (k = (((Line2 - i) * 2) - 1); k >= 1; k--) {
		    	
		      System.out.print(" ");
		      
		    }
		    for (k = 0; k <= 2 * i; k++) {
		    	
		      System.out.print("*");
		      
		    }
		    
		    System.out.println();
		    
		  }
		  
		  
		}	
	
		
	}

