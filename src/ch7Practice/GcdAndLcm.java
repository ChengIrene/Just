package ch7Practice;

import java.io.*;

public class GcdAndLcm {
	
	/*
	 * [ǎ: public/private/default(ぐ或常ぃ糶)] [static/no-static] [return type/void(ぐ或常ぃ肚)] [method name(arg)]
	 * public static void main(String[] args){}
	 * 
	 * private int calculateTwoNumbers(int a, int b){}
	 * 
	 * */
	public static void main(String[] args) throws IOException {
	   System.out.println("Please neter two integer numbers.");
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   // User input strings.
	   String str1 = br.readLine();
	   String str2 = br.readLine();
	   // Transform the strings to int numbers.
	   int a = Integer.parseInt(str1);
	   int b = Integer.parseInt(str2);
	   
	   // Now we can get a and b.
	   // Before invoke(call) methods, we need to new the GcdAndLcm object,
	   // because after we get the GcdAndLcm object, then we can invoke the method on the object.
	   GcdAndLcm gcdAndLcm = new GcdAndLcm();
	   int gcd = gcdAndLcm.calculateGcd(a, b);
	   int lcm = gcdAndLcm.calculateLcm(a, b);
	   int add = gcdAndLcm.gcdAddLcm(gcd, lcm);

	   System.out.println("GCD = " + gcd );
	   System.out.println("LCM = " + lcm );
	   System.out.println("GCD + LCM = " + add );
	}
	
	public int calculateGcd(int a, int b) {
	   while (b > 0) {      //劣锣埃猭( Euclidean algorithm )
	    	int num1 = b;     
	        b = a % b;
	        a = num1;      
	   }
	
	   return a;
	}
	
	public int calculateLcm(int a, int b){
		return a * (b / calculateGcd(a, b));
	}
	
	public int gcdAddLcm(int gcd, int lcm){
		return gcd + lcm;
	}
}
