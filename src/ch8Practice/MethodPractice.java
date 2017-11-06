package ch8Practice;

public class MethodPractice {
	   
    static void number(int num){
    	
      if( num < 100 ){
    	  
       System.out.println(num + " < 100");  
       
      } else {
    	  
       System.out.println(num + " > 100");	  
    	  
      }
	}
	public static void main(String[] args) {
		
	   number(200);
		
	}

}
