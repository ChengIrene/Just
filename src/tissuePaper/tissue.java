package tissuePaper;

import java.io.*;

public class tissue {

	private int sheets ;
	
	public tissue(int tissueSheets){
		
		this.sheets = tissueSheets;
		
	}
	
	public void open() {
		
		System.out.println("You open the tissue!");	
	}
	
	public static void main(String[] args) throws IOException {
       tissue t1 = new tissue(15);
		
		System.out.println("Do you want to use this tissue?  1.YES 2.NO ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String use = br.readLine();
		int num = Integer.parseInt(use);
		
		if( num == 1  ){ 
			
			t1.open();
			
			for(int tissue = 15 ; tissue > 1 ; tissue--){
				
			System.out.println("Your tissue is remaining " + tissue + " sheets.");
			
			}				
			
		    System.out.println("Your tissue is remaining 1 sheet.");
			System.out.println("Your tissue is used up!");	
			
			
		} else if ( num == 2 ){
			
			System.out.println("You don't want to use tissue now.");
			
		} else {
			
			System.out.println("Please answer 1 or 2 , thank you!");		
		}
			
	}

}
