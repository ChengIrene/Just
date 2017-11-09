package ch9Practice;

import java.io.*;

public class ArrayPractice6 {  //Practice to reverse array again!

	public static void main(String[] args) throws IOException {
		
		int num[] = new int[5]; 
		
		System.out.println("Please enter five number.");
		System.out.println("-------------------------");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i <= num.length-1; i++){
			
			System.out.println("Number " + (i+1) );
			num[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("-------------------------");
		System.out.println("Array");
		
		for(int i = 0; i <= num.length-1; i++){
			System.out.print( num[i] + " ");	
		}

		reverseArray(num);
	}
	
	public static void reverseArray(int a[]){
		
		for(int i = 0; i < a.length /2; i++){
		
			int temp = a[i];
			a[i] = a[ a.length-i-1 ];
			a[ a.length-i-1 ] = temp;
		}
		
		System.out.println("\nReverse Array");
		
		for(int i = 0; i < a.length; i++)
		System.out.print( a[i] + " " );	
	}
}