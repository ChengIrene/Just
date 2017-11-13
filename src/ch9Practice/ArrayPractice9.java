package ch9Practice;

public class ArrayPractice9 {  //rank

	public static void main(String[] args){
		
		String name[] = { "Yuri KATSUKI", "Phichit CHULANONT", "Yuri PLISETSKY" , "Christophe GIACOMETTI", "Otabek ALTIN" , "Jean Jack LEORY" };
        double totalPoints[] = { 319.41, 289.56, 319.53, 290.69, 293.57, 300.62 };
        
        for(int i = 0; i < totalPoints.length; i++){
        	System.out.println( name[i] + " - " + totalPoints[i]);      	
        }
        
        for(int i = 0; i < totalPoints.length-1; i++){
        	for(int j = 0; j < totalPoints.length-i-1; j++){
        		if(totalPoints[j] < totalPoints[j+1]){
        			
        			double temp1 = totalPoints[j];
        			totalPoints[j] = totalPoints[j+1];
        			totalPoints[j+1] = temp1;
        			
        			String temp2 = name[j];
        			name[j] = name[j+1];
        			name[j+1] = temp2;
        		}
        	}
        }
        System.out.println("---------------------------------------");
        for(int k =0; k < totalPoints.length; k++ ){
        	System.out.println("No." + (k+1) + " : " + name[k] + " - " + totalPoints[k]);
        }  
	}
}
