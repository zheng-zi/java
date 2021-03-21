package week;

import java.util.Scanner;

public class dollarConversion {
	public static void main(String a[]) {
		//定义
		float dollars;
		int twoDollars;
		int oneDollars;
		int fiftyCent;
		int twentyCent;
		int fiveCent;
		
		//输入
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入总金额：");
		dollars = scan.nextFloat();
		
		//处理
		
	/*	int i=0;
		if(dollars-(int)dollars>0) {
			dollars=dollars*10;
			i++;
		}
		这里让dollars变为整数后不是太清楚应该怎样进行后续计算
        如果twoDollars = (int) (dollars/(2*Math.pow(10,i));
        计算出的仍然是小数取整，感觉效果没变  */
		
		twoDollars = (int) (dollars/2);
		oneDollars = (int) ((dollars - twoDollars*2)/1);
		fiftyCent = (int) ((dollars-twoDollars*2-oneDollars)/0.5);
		twentyCent = (int) ((dollars-twoDollars*2-oneDollars-fiftyCent*0.5)/0.2);
		fiveCent = (int) ((dollars-twoDollars*2-oneDollars-fiftyCent*0.5-twentyCent*0.2)/0.05+1);
		
		//输出
		System.out.println("2美元个数："+twoDollars);
		System.out.println("1美元个数："+oneDollars);
		System.out.println("50美分个数："+fiftyCent);
		System.out.println("20美分个数："+twentyCent);
		System.out.println("5美分个数："+fiveCent);
	}

	private static int pow(int i, int i2) {
		// TODO Auto-generated method stub
		return 0;
	}
}