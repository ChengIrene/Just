package ch6Practice;

import java.io.*;

public class Ch6Practice {

 public static void main(String[] args) throws IOException {
	 
	 System.out.println("Please enter an integer value.");
	 System.out.println("This program can determine this integer value is a multiple of 3.5.7 or not.");
	 
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 String str1 = br.readLine();
	 int num1 = Integer.parseInt(str1);
	 
	 if ( num1 % 3 == 0 && num1 % 15 != 0 && num1 % 21 != 0 && num1 % 105 != 0 ) {
		 
		 System.out.println( "Integer value "  + num1 + " is a multiple of 3." );
		 
	 } else if ( num1 % 5 == 0 && num1 % 15 != 0 && num1 % 35 != 0 && num1 % 105 != 0 ) {
		 
		 System.out.println( "Integer value "  + num1 + " is a multiple of 5." );
		 
	 } else if ( num1 % 7 == 0 && num1 % 21 != 0 && num1 % 35 != 0 && num1 % 105 != 0 ) {
		 
		 System.out.println( "Integer value "  + num1 + " is a multiple of 7." );
		 
	 } else if ( num1 % 15 == 0 && num1 % 105 != 0 ) {
		 
		 System.out.println( "Integer value "  + num1 + " is a multiple of 3 and 5." );
		 
	 } else if ( num1 % 21 == 0 && num1 % 105 != 0 ) {
		 
		 System.out.println( "Integer value "  + num1 + " is a multiple of 3 and 7." );
		 
	 } else if ( num1 % 35 == 0 && num1 % 105 != 0 ) {
		 
		 System.out.println( "Integer value "  + num1 + " is a multiple of 5 and 7." );
		 
	 } else if ( num1 % 105 == 0 ) {
		 
		 System.out.println( "Integer value "  + num1 + " is a multiple of 3, 5 and 7." );
		 
	 } else {
		 
		 System.out.println( "This integer value is not a multiple of 3, 5 and 7." );
		 
	 } 
	 
 }
}
