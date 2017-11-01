package ch6Practice;

import java.io.*;

public class Ch6Practice2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter your grade.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		if ( 100 >= num1 && num1 >= 90 ){
			
			System.out.println("Your grade is level A.");
		
		} else if ( 90 > num1 && num1 >=80 ){
			
			System.out.println("Your grade is level B.");
			
		} else if ( 80 > num1 && num1 >= 70 ){
			
			System.out.println("Your grade is level C.");
			
		} else if ( 70 > num1 && num1 >= 60 ){
			
			System.out.println("Your grade is level D.");
			
		} else if ( 60 > num1 && num1 >= 0 ){
			
			System.out.println("Your grade is level F.");
			
		} else {
			
			System.out.println("Please check your grade again.");
			
		}
	}

}
