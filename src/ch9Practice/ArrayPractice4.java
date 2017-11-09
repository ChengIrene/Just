package ch9Practice;

public class ArrayPractice4 {
	
	static int findMax(int x[]){
		int largest = 0;
		for(int a = 0; a <= x.length-1; a++){
			if( x[a] > largest){
				largest = x[a];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		
		int max = 0;
		int num[] = {24243, 132223, 24131, 234243, 123523};
		
		max = findMax(num);
		
		System.out.println("Max: " + max);
		}
}
