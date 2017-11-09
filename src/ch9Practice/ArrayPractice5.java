package ch9Practice;

public class ArrayPractice5 { //Reverse Array

	public static void main(String[] args) {
		
		int num1[] = new int[] {1, 2, 3, 4, 5};
		
		for(int a = 0; a < num1.length; a++){
			System.out.print( num1[a] + " ");
		}
		
		System.out.println("\nReverse array");
		
		for(int i = 0; i < num1.length /2; i++){
			
			int num2 = num1[i];
			num1[i] = num1[num1.length-1-i];
			num1[num1.length-1-i] = num2;

		}
		for (int i = 0; i < num1.length; i++) {
		System.out.print( num1[i] + " ");
		
		}
	}
}
