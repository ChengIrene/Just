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
	  System.out.println("�ش��O����"+tall+"���إ��H");
	  double Doutall=tall;
	  System.out.println("���H�ĹL�ӤF!!! �N�O���Ө���"+Doutall+"���ت��_�κذ�!!!");
	 
	  for (int distance = 1000; distance >= 100 ; distance=distance-200) {
		  
		  System.out.println("�ؼжZ���٦�"+distance+"����");
		  
	  }
	  
	  System.out.println("���Ǫ����ͪ�� : ����!!! �k���F�F!!! �u��@�ԤF!!! �ڰڰڰڰ�-----!!!");
	  System.out.println("�����@���m�W��Ŧ���h�L,�A���ⰵ�X��˪���ܩO!?");
	  System.out.println("���1: �_�κغ⤰��!!! �Ѥl�ڤ~���ȧA�ڰڰ�---!!!");
	  System.out.println("���2: �Ѥl���s�浹�A�`�i�H�F�a---!!!? �W�a��s,�N�M�w�O�A�F");
	  System.out.println("���3: ��L������!!! �L���ֱϧ�!!!");
	  System.out.println("���4: �b���e����ë��,��ë�ۤv�N�Ӥ��n�X�ͦb�o�ذ��@��");
	  System.out.println("-------------------------------------------------------------------------------------");
	  
	  System.out.println("�ӧa!!!��ܪ��ɨ��F!!!");
	   
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
	  
	  
	  String str1 = br.readLine();
	  String str2 = br.readLine();
	  
	  int num1 = Integer.parseInt(str1);
	  
	  
	  int help = num1 ;
	  
	  switch (help) {
	  
	  case 1: System.out.println("���1�����G: ���ߧA���\�Q��F�@���_�κ�!!! ���L�b�԰����~���A���w�g�Q��L���H�����]��F...��......");
	      break;
	  case 2: System.out.println("���2�����G: �_�κثܰ��������s���Y���F,�A�]���Q�����F�U��,���O���ѱߤW�A�o�Q�����W���H�h�q�᭱�����Ө��`�F");
	      break;
	  case 3: System.out.println("���3�����G: �A�ڥ��䤣��L��,�L���]�S�űϧA,�ҥH�A�٬O�u�n����_�κؤF,�O��");
	      break;
	  case 4: System.out.println("���4�����G: �����a,�o�̮ڥ��S���H,�p�٤�����Ū��?");
	      break;
	  default: System.out.println("�п�J�Ʀr1~4����,���M�U�����t���h�G ");
	      break;
	  
	  }
	  

	  

 }	
}
