package week8;

import java.util.Scanner;

public class pastword {
	public static void main(String[] asg) {
		System.out.println("您的密码必须必须符合以下要求：");
		System.out.println("1.密码必须有一位大写");
		System.out.println("2.密码必须有一位小写");
		System.out.println("3.密码必须有一位数字");
		System.out.println("4.密码不能存在空格");
		System.out.println("请输入您的密码：");
		
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
			System.out.println("密码位数不对");
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
			info += "密码符合要求\n";
			System.out.println(info);
		}
		else
		{
			if(hasSpace)
				info += "密码存在空格\n";
			if(!hasUpp)
				info += "密码必须有一位大写\n";
			if(!hasLow)
				info += "密码必须有一位小写\n";
			if(!hasDig)
				info += "密码必须有一位数字\n";
			System.out.println(info);
		}
		
		
	}

}
