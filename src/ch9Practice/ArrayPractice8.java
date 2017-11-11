package ch9Practice;

public class ArrayPractice8 { //Revise Array 

	public static void main(String[] args) {
		
		float grade[] = {60, 36, 45, 81, 24};
		System.out.println("Original grades: ");

        for(int i = 0; i < grade.length; i++){
        	
        	System.out.print( grade[i] + " " );
        }
        System.out.println("");
        reviseGrade(grade);
        System.out.println("Revised grades: ");
        
        for(int i = 0; i < grade.length; i++){
        	
        	System.out.print( grade[i] + " ");
        }    
	}
	
	public static void reviseGrade(float x[]){
		for(int j = 0; j < x.length; j++ ){
			
			x[j] = (float) (Math.sqrt(x[j])*10) ;
		}	
	}
}
