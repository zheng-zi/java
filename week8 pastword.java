package week8;

import java.util.Scanner;

public class pastword {
	public static void main(String[] asg) {
		System.out.println("���������������������Ҫ��");
		System.out.println("1.���������һλ��д");
		System.out.println("2.���������һλСд");
		System.out.println("3.���������һλ����");
		System.out.println("4.���벻�ܴ��ڿո�");
		System.out.println("�������������룺");
		
		Object system;
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		int len = password.length();
		
		boolean lengthok = false;
		boolean hasSpace = false;
		boolean hasUpp = false;
		boolean hasLow = false;
		boolean hasDig = false;
		
		if(len<8 || len>15) {
			System.out.println("����λ������");
			return;
		}
		
		for(int i = 0; i < len; i++){
			char c = password.charAt(i);
			if(c == ' ')
				hasSpace = true;
			if(c>='A' && c<='Z')
				hasUpp = true;
			if(c>='a' && c<='z')
				hasLow = true;
			if(c>= '0' && c<= '9')
				hasDig = true;
		}
		
		String info = "";
		if(!hasSpace&&hasUpp&&hasLow&&hasDig)
		{
			info += "�������Ҫ��\n";
			System.out.println(info);
		}
		else
		{
			if(hasSpace)
				info += "������ڿո�\n";
			if(!hasUpp)
				info += "���������һλ��д\n";
			if(!hasLow)
				info += "���������һλСд\n";
			if(!hasDig)
				info += "���������һλ����\n";
			System.out.println(info);
		}
		
		
	}

}
