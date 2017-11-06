package ch8Practice;

import java.io.*;

public class MethodPractice5 {   // Enter two number, this code can add from num1 to num2 
	
	static void add(int a, int b){
		
       int sum = 0;
      
      if(a <= b){
    	 
	    while(a <= b){
		
	       sum = sum + a;	
	       a++;
	  }
	       System.out.println(sum);	
	  
      } else if (a >=b ){
	  
	       while(a >= b){
		  
		   sum = sum + a;	
		   a--;  
	  }
	       System.out.println(sum);
	  
      } else if (a == b){
    	
		   System.out.println(a+b);
    }
   }

	public static void main(String[] args) throws IOException {
	
		System.out.println("Please enter two integer number.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.print("Add from " + num1 + " to " + num2 + " = " );
	
		add(num1, num2);		
	}
}
