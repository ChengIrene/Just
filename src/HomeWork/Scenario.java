package HomeWork;

public class Scenario {

	public static void main(String[] args) {
		Titans t1 = new Titans(false, 15, 30, 2000, "T1");
		Titans t2 = new Titans(true, 8, 40, 1500, "T2");
		Titans t3 = new Titans(true, 2, 10, 500, "T3");
		Titans t4 = new Titans(true, 5, 25, 900, "T4");
		Titans t5 = new Titans(false, 10, 20, 1800, "T5");
		Titans t6 = new Titans(true, 18, 35 , 1100, "T6");
		Titans t7 = new Titans(true, 12, 15, 1200, "T7");
		
		System.out.println("t1 speed: " + t1.getSpeed());
		t1.seePeople();
		System.out.println("t1 speed: " + t1.getSpeed());
		double time1 = t1.calcTime();
		System.out.println("t1 needs: " + time1 + " sec. to catch you!");
		
		System.out.println("t2 speed: " + t2.getSpeed());
		t2.seePeople();
		System.out.println("t2 speed: " + t2.getSpeed());
		double time2 = t2.calcTime();
		System.out.println("t2 needs: " + time2 + " sec. to catch you!");
		
		System.out.println("t3 speed: " + t3.getSpeed());
		t3.seePeople();
		System.out.println("t3 speed: " + t3.getSpeed());
		double time3 = t3.calcTime();
		System.out.println("t3 needs: " + time3 + " sec. to catch you!");
		
		System.out.println("t4 speed: " + t4.getSpeed());
		t4.seePeople();
		System.out.println("t4 speed: " + t4.getSpeed());
		double time4 = t4.calcTime();
		System.out.println("t4 needs: " + time4 + " sec. to catch you!");
		
		System.out.println("t5 speed: " + t5.getSpeed());
		t5.seePeople();
		System.out.println("t5 speed: " + t5.getSpeed());
		double time5 = t5.calcTime();
		System.out.println("t5 needs: " + time5 + " sec. to catch you!");
		
		System.out.println("t6 speed: " + t6.getSpeed());
		t6.seePeople();
		System.out.println("t6 speed: " + t6.getSpeed());
		double time6 = t6.calcTime();
		System.out.println("t6 needs: " + time6 + " sec. to catch you!");
		
		System.out.println("t7 speed: " + t7.getSpeed());
		t7.seePeople();
		System.out.println("t7 speed: " + t7.getSpeed());
		double time7 = t7.calcTime();
		System.out.println("t7 needs: " + time7 + " sec. to catch you!");
		
		
		double[] needTimes = {time1, time2, time3, time4, time5, time6, time7};
		
		for(int b = 0 ; b < needTimes.length ; b++) {
		
			System.out.println("編號" + (b+1) + "的巨人將在" + needTimes[ b ] + "秒後追上來!");
			
			for(int a = 0 ; a < needTimes.length-1 ; a++) {
				System.out.println("編號" + (b+1) + "的巨人將在" + needTimes[ b ] + "秒後追上來!");
			}
		
		}
		
        for(int a = 0 ; a < needTimes.length-1 ; a++){  //共執行needTimes.length-1次
          	
        	for (int c = 0 ; c < needTimes.length-a-1 ; c++){ 
        		
        		if ( needTimes[ c ] > needTimes[ c+1 ]){
        			double temp = needTimes[ c ];
        			needTimes[ c ] = needTimes[ c+1 ];
        			
        			needTimes[ c+1 ] = temp;
        			
        	        //將needTimes[ c ]與needTimes[ c+1 ] 位置對調
        			
        		}        				
        		
        		
        	}
        	
        }
		
       for(int b = 0 ; b < needTimes.length ; b++){
       System.out.println( needTimes[ b ] );
       
       }
       
       
       
       
	}
}

