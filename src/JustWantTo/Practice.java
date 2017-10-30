package JustWantTo;

import java.io.*;

public class Practice {
	
	public static void main(String args[])throws IOException {
	  
	  int a=1;
	  long b=100000;
	  float f=1.5f;
	  double d=33.333;
	  
	  String output;
	  output= "\nitn=" + String.valueOf(a) +
			  "\nlong=" + String.valueOf(b) +
			  "\nfloat=" + String.valueOf(f) +
			  "\ndouble=" + String.valueOf(d);
	  
	  System.out.println(output);
	  
	  int tall=8;
	  System.out.println("目測是身長"+tall+"公尺巨人");
	  double Doutall=tall;
	  System.out.println("巨人衝過來了!!! 就是那個身長"+Doutall+"公尺的奇形種啊!!!");
	 
	  for (int distance = 1000; distance >= 100 ; distance=distance-200) {
		  
		  System.out.println("目標距離還有"+distance+"公尺");
		  
	  }
	  
	  System.out.println("身旁的隊友表示 : 不行!!! 逃不了了!!! 只能作戰了!!! 啊啊啊啊啊-----!!!");
	  System.out.println("身為一個獻上心臟的士兵,你打算做出怎樣的選擇呢!?");
	  System.out.println("選擇1: 奇形種算什麼!!! 老子我才不怕你啊啊啊---!!!");
	  System.out.println("選擇2: 老子把艾連交給你總可以了吧---!!!? 上吧艾連,就決定是你了");
	  System.out.println("選擇3: 找兵長先啊!!! 兵長快救我!!!");
	  System.out.println("選擇4: 在死前做祈禱先,祈禱自己將來不要出生在這種鬼世界");
	  System.out.println("-------------------------------------------------------------------------------------");
	  
	  System.out.println("來吧!!!選擇的時刻到了!!!");
	   
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
	  
	  
	  String str1 = br.readLine();
	  String str2 = br.readLine();
	  
	  int num1 = Integer.parseInt(str1);
	  
	  
	  int help = num1 ;
	  
	  switch (help) {
	  
	  case 1: System.out.println("選擇1的結果: 恭喜你成功討伐了一隻奇形種!!! 不過在戰鬥的途中你其實已經被其他巨人漸漸包圍了...嗯......");
	      break;
	  case 2: System.out.println("選擇2的結果: 奇形種很高興的把艾連給吃掉了,你也順利的活了下來,但是有天晚上你卻被不知名的人士從後面攻擊而身亡了");
	      break;
	  case 3: System.out.println("選擇3的結果: 你根本找不到兵長,兵長也沒空救你,所以你還是只好面對奇形種了,保重");
	      break;
	  case 4: System.out.println("選擇4的結果: 醒醒吧,這裡根本沒巨人,妳還不趕快讀書?");
	      break;
	  default: System.out.println("請輸入數字1~4拜偷,雖然下場都差不多慘 ");
	      break;
	  
	  }
	  

	  

 }	
}
