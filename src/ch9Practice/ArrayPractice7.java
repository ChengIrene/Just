package ch9Practice;

import java.util.Random;

public class ArrayPractice7 { //From 1 to 49 to take seven numbers, and not repeated.
	
	public static void main(String[] args) {
	
		int num[] = new int[49];
		
		Random rand = new Random(); 
		
		for (int n = 0; n < 49; n++) { 
			
			num[n] = n+1;
		}
		
		for (int n = 0; n < 49; ++n) {
			
			int pos = rand.nextInt(49);
			int tmp = num[n];
			num[n] = num[pos];
			num[pos] = tmp;
		}
		
		for (int n = 0; n < 7; n++) {
			System.out.print(num[n] + " ");
			
			}	    				
		}
    }
