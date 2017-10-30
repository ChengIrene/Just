package HomeWork;

import java.text.SimpleDateFormat;

/**
 * @author YO
 */
public class Titans {
	private boolean normal; 
	private int length;
	private int speed;
	private int distance;
	private String name;
	
	/**
	 *
	 * @param normal: Normal or Abnormal
	 * @param length: The length of the titans
	 * @param speed: initial speed
	 * @param distanc: The distance to humans how many kilometer
	 */
	public Titans(boolean normal, int length, int speed, int distance, String name){
		this.normal = normal;
		this.length = length;
		this.speed = speed;		
		this.distance = distance;
		this.name = name;
		
	}
	
	/**
	 * 
	 */
	public void seePeople(){
		System.out.println("see people");
		if(normal) {
			speed = speed *2;
		} else{
			speed = speed *5;
		}	
	}
	
	/**
	 * 
	 * 
	 */
	public int getSpeed(){
		return this.speed;
	}	
	/*
	 * 回傳所需秒數
	 */
	public double calcTime(){
		return distance/speed;		
	}
	
	public String rank() {
		
		
		
		return name;
	
	}
}
