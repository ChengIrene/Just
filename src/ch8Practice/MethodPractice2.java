package ch8Practice;

public class MethodPractice2 {

	static void math(double base, double pow){
		
	if ( pow < 0 ){
	   
		System.out.println("It can not be negetive.");
	
	} else if ( pow == 0){
		
		System.out.println("1");
		
	} else {
  		
		long power = 1;
		
		for(int c = 1; c <= pow; c++){
			
		   power *= base;
			
		}	
		
		System.out.println(power);	
	}		
	}	
	
	public static void main(String[] args) {
		
	  math(7,12);
		
	}
}
