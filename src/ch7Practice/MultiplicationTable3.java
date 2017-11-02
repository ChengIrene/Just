package ch7Practice;

public class MultiplicationTable3 {

	public static void main(String[] args) {

      int a=1;
      
      do{
    	 
    	  int b=1;
    	 
    	 do{
    		 
    		System.out.print(b + "*" + a + " = " + (a*b) + " \t" );
    		
    		b++; 
    		 
    	 } while (b<=9);
 
    	   a++;
    	 
    	   System.out.println(b);
    	 
      } while(a<=9);
        
	}

}
