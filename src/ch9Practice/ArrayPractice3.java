package ch9Practice;

public class ArrayPractice3 {

	public static void main(String[] args) {
		
		int studentID[] = {1, 2, 3, 4};
		int score[] = {70, 30, 90, 50};
		
		for(int a = 0; a < score.length; a++){
			System.out.println("Student number " + studentID[a] + " score: " + score[a]);		
		}		
		
		for(int b = 0; b < score.length-1; b++){
			for(int c = 0; c < score.length-b-1; c++){
				if( score[c] < score[c+1]){
					
					int sco1 = score[c];
					score[c] = score[c+1];
					score[c+1] = sco1;
					
					int sco2 = studentID[c];
					studentID[c] = studentID[c+1];
					studentID[c+1] = sco2;
				}				
			}			
		}
		
		System.out.println();
		System.out.println("From higt score to low score");
		System.out.println("-------------------------------");
		
		   for(int d = 0; d < score.length; d++){
			   System.out.println("Student number " + studentID[d] + " score: " + score[d] );
			   
		   }    	
		}
}