package week;

import java.util.Scanner;

public class dollarConversion {
	public static void main(String a[]) {
		//����
		float dollars;
		int twoDollars;
		int oneDollars;
		int fiftyCent;
		int twentyCent;
		int fiveCent;
		
		//����
		Scanner scan=new Scanner(System.in);
		System.out.println("�������ܽ�");
		dollars = scan.nextFloat();
		
		//����
		
	/*	int i=0;
		if(dollars-(int)dollars>0) {
			dollars=dollars*10;
			i++;
		}
		������dollars��Ϊ��������̫���Ӧ���������к�������
        ���twoDollars = (int) (dollars/(2*Math.pow(10,i));
        ���������Ȼ��С��ȡ�����о�Ч��û��  */
		
		twoDollars = (int) (dollars/2);
		oneDollars = (int) ((dollars - twoDollars*2)/1);
		fiftyCent = (int) ((dollars-twoDollars*2-oneDollars)/0.5);
		twentyCent = (int) ((dollars-twoDollars*2-oneDollars-fiftyCent*0.5)/0.2);
		fiveCent = (int) ((dollars-twoDollars*2-oneDollars-fiftyCent*0.5-twentyCent*0.2)/0.05+1);
		
		//���
		System.out.println("2��Ԫ������"+twoDollars);
		System.out.println("1��Ԫ������"+oneDollars);
		System.out.println("50���ָ�����"+fiftyCent);
		System.out.println("20���ָ�����"+twentyCent);
		System.out.println("5���ָ�����"+fiveCent);
	}

	private static int pow(int i, int i2) {
		// TODO Auto-generated method stub
		return 0;
	}
}