package Temperature;

import java.io.*;

public class Temperature {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter a Celsius temperature");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
	 double num1 = Integer.parseInt(str1);		
	 
	    double f;
	    
	    f = num1*9/5+32;
	    		
	    System.out.println(num1 + " ¢J  = "+ f + " ¢K");
	    
	    System.out.println("---------------------------------------");
	    
	    System.out.println("Please enter a Fahrenheit temperature");
	    
	    String str2 = br.readLine();
	    
	  double num2 = Integer.parseInt(str2);
	  
	    double c;
	    
	    c = (num2-32)*5/9;
	    
	    System.out.println(num2 + " ¢K  = " + c + " ¢J " );

	}

}
