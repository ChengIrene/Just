package ch6Practice;

import java.io.*;

public class RefactorCh6Practice {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter an integer value.");
		System.out.println("This program can determine this integer value is a multiple of 3.5.7 or not.");
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		if ((num1 % 3 == 0) || (num1 % 5 == 0) || (num1 % 7 == 0) ) {
			
			System.out.println("This integer value is a multiple of 3, 5 or 7.");
			
		} else {
			
			System.out.println("This integer value is not a multiple of 3, 5 or 7.");
			
		}

	}

}
