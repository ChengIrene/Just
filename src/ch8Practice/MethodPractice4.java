package ch8Practice;

public class MethodPractice4 { //Calculate the length of right triangle hypotenuse
	
	static void rightTriangleSide(double a, double b){  
		
		double aa = Math.pow(a, 2);     //right triangle (a*a) + (b*b) = (c*c)
		double bb = Math.pow(b, 2);
		double ab = aa + bb;
		
		System.out.println(Math.sqrt(ab));		
	}
	
	public static void main(String[] args) {
	
		rightTriangleSide(8.9, 4.5);
	}
}