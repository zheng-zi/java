package week;

import java.util.Scanner;

public class narcissus {
	public static void main(String[] a) {
		//定义
		int weishu;
		int number;
		
		//输入
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入水仙花的位数:");
		weishu = scan.nextInt();
		for(number = (int) Math.pow(10, weishu-1);number<Math.pow(10, weishu);number++) {
			int data = number;
			int sum=0;
			while(data != 0) {
				int wei=data%10;
				sum=(int) (sum+Math.pow(wei, weishu));
				data = data/10;
			}
			if(number == sum) {                    //number换成data运行没反应？？？
				System.out.println("水仙花数："+number);
			}
		}
	}
}