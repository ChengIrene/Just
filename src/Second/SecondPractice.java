package Second;

import java.io.*;

public class SecondPractice {

	public static void main(String[] args)throws IOException {
		
		System.out.println("Please enter a number of seconds.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		
		int day;
		int hour;
		int min;
		int sec;
		
		day = num1/86400;
		hour = (num1%86400)/3600;
		min = (num1%86400)%3600/60;
		sec = (num1%86400)%3600%60%60;
		
		System.out.println(num1 + " sec = " + day + " day(s) " + hour + " hr " + min + " min " + sec + " sec ");		

	}

}
