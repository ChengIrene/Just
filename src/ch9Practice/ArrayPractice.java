package ch9Practice;

import java.io.*;

public class ArrayPractice {    // check passing grade and fail grade

	public static void main(String[] args) throws IOException {
		
		int grade[] = new int[5];
		int passAndFail[] = {0, 0};
	
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		for(int i =0; i <= grade.length-1; i++){
		
			System.out.println("Please enter a grade.");
			grade[i] = Integer.parseInt(br.readLine());		
		}
 
		checkScore(grade,passAndFail);
		System.out.println("Total: " +  passAndFail[0] + " passing grade(s) and " + passAndFail[1] + " failing grade(s)." );

	}

	static void checkScore(int score[], int count[]){
		
		for(int i = 0; i <= score.length-1; i++){
			
			if( score[i] >= 60 ){
				count[0] = count[0] + 1;
				
			} else if ( score[i] < 60 ) {
				count[1] = count[1] + 1;
				
			}
		}  	
	}	
}
