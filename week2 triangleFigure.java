package week;

import java.util.Scanner;

public class triangleFigure {
	public static void main(String[] a) {
		//定义
		int n;
		
		//输入
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入三角图形的行数n：");
		n = scan.nextInt();
		
		//处理
		System.out.println("图形如下：");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}
}