package week;

import java.util.Scanner;

public class narcissus {
	public static void main(String[] a) {
		//����
		int weishu;
		int number;
		
		//����
		Scanner scan = new Scanner(System.in);
		System.out.println("������ˮ�ɻ���λ��:");
		weishu = scan.nextInt();
		for(number = (int) Math.pow(10, weishu-1);number<Math.pow(10, weishu);number++) {
			int data = number;
			int sum=0;
			while(data != 0) {
				int wei=data%10;
				sum=(int) (sum+Math.pow(wei, weishu));
				data = data/10;
			}
			if(number == sum) {                    //number����data����û��Ӧ������
				System.out.println("ˮ�ɻ�����"+number);
			}
		}
	}
}