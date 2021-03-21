package week;

import java.util.Scanner;

public class week3 {
	public static double score[];

	public static void main(String[] a) {
		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				if (score == null) {
					System.out.println("输入错误，请重新输入");
				}
				choose = average();
				break;
			case 3:
				if (score == null) {
					System.out.println("输入错误，请重新输入");
				}
				choose = max();
				break;
			case 4:
				if (score == null) {
					System.out.println("输入错误，请重新输入");
				}
				choose = min();
				break;
			default:
				System.out.println("输入错误，请重新输入！");
			}
			choose = menu();
		}
		System.out.println("over!");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("========score========");
		System.out.println("1.input");
		System.out.println("2.average");
		System.out.println("3.high");
		System.out.println("4.low");
		System.out.println("5.exit");
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入选项：");
		choose = scan.nextInt();
		return choose;

	}

	public static void input() {
		score = new double[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入" + (i + 1) + "个学生成绩");
			boolean ok = false;
			while (!ok) {
				score[i] = scan.nextDouble();
				if (score[i] < 0 || score[i] > 100) {
					System.out.println("输入错误，请重新输入");
				} else {
					ok = true;
				}
			}
		}

	}

	public static int average() {
		int sum = 0;
		int average = 0;
		for (int i = 0; i < score.length; i++) {
			sum = (int) (sum + score[i]);
			average = sum / (i + 1);
		}
		average = sum / 5;
		System.out.println("average:" + average);
		return average;
	}

	public static int max() {
		int max = (int) score[0];
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = (int) score[i];
			}
		}
		System.out.println("max:" + max);
		return max;
	}

	public static int min() {
		int min = (int) score[0];
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = (int) score[i];
			}
		}
		System.out.println("min:" + min);
		return min;
	}
}
