package ch9Practice;

import java.io.*;

public class ArrayPractice2 {   // Find maximum number

	public static void main(String[] args) throws IOException {
		
		int max = 0;
		int num[] = new int[5];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter five numbers.");
		
		for(int i = 0; i <= num.length-1; i++){
			
			num[i] = Integer.parseInt(br.readLine());		
		}

		max = maxOfNumber(num);
		System.out.println("Maximum number = " + max );
		
	}

    static int maxOfNumber(int a[]){
    	
    	int largest = 0;
    	
    	for (int i = 0; i <= a.length-1; i++){
    	   	
    		if( a[i] > largest){
    			largest = a[i];
    		}
    	}   	
    	
    	return largest;
    } 
}
