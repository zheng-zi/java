package week;

import java.util.Scanner;

public class triangleFigure {
	public static void main(String[] a) {
		//����
		int n;
		
		//����
		Scanner scan=new Scanner(System.in);
		System.out.println("����������ͼ�ε�����n��");
		n = scan.nextInt();
		
		//����
		System.out.println("ͼ�����£�");
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