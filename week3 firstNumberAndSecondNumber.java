package week;

import java.util.Scanner;

public class firstNumberAndSecondNumber {
	public static int firstNum,secondNum;

	public static void main(String[] a) {
		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				choose = output1();
				break;
			case 3:
				choose = output2();
				break;
			case 4:
				choose = output3();
				break;
			default:
				System.out.println("����������������룡");
			}
			choose = menu();
		}
		System.out.println("over!");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("========score========");
		System.out.println("1.input");
		System.out.println("2.output1");
		System.out.println("3.output2");
		System.out.println("4.output3");
		System.out.println("5.exit");
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѡ�");
		choose = scan.nextInt();
		return choose;

	}

	public static void input() {
		System.out.println("������������������һ����С�ڵڶ���������");
		Scanner scan = new Scanner(System.in);
		firstNum = scan.nextInt();
		secondNum = scan.nextInt();
	}

	public static int output1() {
		System.out.println("����֮�������Ϊ��");
		int number;
		for(number=firstNum ; number<=secondNum ; number++){
			if(number%2!=0){
				System.out.println(number);
			}
		}
		return number;
	}

	public static int output2() {
		System.out.println("����֮���ż����Ϊ��");
		int number,sum=0;
		for(number=firstNum ; number<=secondNum ; number++){
			if(number%2==0){
				sum=sum+number;
			}
		}
		System.out.println(sum);
		return sum;
	}
	public static int output3() {
		System.out.println("����֮�������ƽ����Ϊ��");
		int number,sum=0;
		for(number=firstNum ; number<=secondNum ; number++){
			if(number%2!=0){
				int number2;
				number2=number*number;
				sum=sum+number2;
			}
		}
		System.out.println(sum);
		return sum;
	}
}