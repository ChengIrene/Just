package ch8Practice;

public class MethodPractice3 {  // Math Method 
	
	static void abs(double a){
		
	    System.out.println(Math.abs(a));	
	}
	
	static void sqrt(double b){
		
		System.out.println(Math.sqrt(b));
	}
	
	static void pow(double c, double d){
		
		System.out.println(Math.pow(c, d));
	}
	
	static void max(double e, double f ){
		
		System.out.println(Math.max(e, f));
	}
	
	static void min(double g, double h){
		
		System.out.println(Math.min(g, h));
	}
	
	public static void main(String[] args) {
		
		abs(-1000);
		sqrt(123.45);
		pow(5, 6);
		max(233, 456);
		min(123, 555);
	}
}
