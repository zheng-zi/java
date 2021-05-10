/*
package week11C;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class operation {
	public static void main(String[] args) {
		String regxMobiles="\\w+\\(\\d*,\\d*\\)|\\w+\\(\\d*\\)";
		System.out.println("请输入表达式:doubleme(min(1,max(add(5,6),sub(5,4))))");
		Scanner scan=new Scanner(System.in);
		String msg="doubleme(min(1,max(add(5,6),sub(5,4))))";
		Pattern p=Pattern.compile(regxMobiles);
		Matcher m=p.matcher(msg);
		while(m.find())
		{
				msg=msg.replace(m.group(), Complex(m.group()));
				m=p.matcher(msg);
		}
		System.out.println("结果为"+msg);
	}
	
	
	
	
	public static String Complex(String express)
	{
		int flag = 0;
		for (int i = 0; i < express.length(); i++) {
			char c = express.charAt(i);
			if (c == ',')
				flag = 1;

		}
		if (flag == 1) {
			int data1 = express.indexOf("(");
			int data2 = express.indexOf(",");
			int data3 = express.indexOf(")");

			String result="";;
			String operator = express.substring(0, data1);
			String num1 = express.substring(data1 + 1, data2);
			String num2 = express.substring(data2 + 1, data3);

			int Num1 = Integer.parseInt(num1);
			int Num2 = Integer.parseInt(num2);

			if (operator.equals("add")) {
				 result = String.valueOf(Num1 + Num2);
				System.out.println("add(" + num1 + "," + num2 + ")=" + result);
			}
			if (operator.equals("sub")) {
				 result = String.valueOf(Num1 - Num2);
				System.out.println("sub(" + num1 + "," + num2 + ")=" + result);
			}
			if(operator.equals("max")) {
				if(Num1>Num2)
					result = String.valueOf(Num1);
				else
					result = String.valueOf(Num2);
				System.out.println("max(" + num1 + "," + num2 + ")=" + result);
			}
			if(operator.equals("min")) {
				if(Num1>Num2)
					result = String.valueOf(Num2);
				else
					result = String.valueOf(Num1);
				System.out.println("min(" + num1 + "," + num2 + ")=" + result);
			}
			return result;
		} else {
			int data1 = express.indexOf("(");
			int data2 = express.indexOf(")");

			String result="";
			String operator = express.substring(0, data1);
			String num = express.substring(data1 + 1, data2);

			int Num = Integer.parseInt(num);
			if (operator.equals("doubleme")) {
				result = String.valueOf(Num * 2);
				System.out.println("doubleme(" + num + ")=" + result);
			}
			return result;
		}
	}
}
*/

package week11C;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class operation {
	public static void main(String[] args) {
		String regxMobiles="\\w+\\(\\d*,\\d*\\)|\\w+\\(\\d*\\)";
		System.out.println("表达式:add(5,max(10,sub(5,2)))");
		Scanner scan=new Scanner(System.in);
		String msg="add(5,max(10,sub(5,2)))";
		Pattern p=Pattern.compile(regxMobiles);
		Matcher m=p.matcher(msg);
		while(m.find())
		{
				msg=msg.replace(m.group(), Complex(m.group()));
				m=p.matcher(msg);
		}
		System.out.println("所以add(5,max(10,sub(5,2)))="+msg);
	}
	
	public static String Complex(String express)
	{
		int flag = 0;
		for (int i = 0; i < express.length(); i++) {
			char c = express.charAt(i);
			if (c == ',')
				flag = 1;

		}
		if (flag == 1) {
			int data1 = express.indexOf("(");
			int data2 = express.indexOf(",");
			int data3 = express.indexOf(")");

			String result="";;
			String operator = express.substring(0, data1);
			String num1 = express.substring(data1 + 1, data2);
			String num2 = express.substring(data2 + 1, data3);

			int Num1 = Integer.parseInt(num1);
			int Num2 = Integer.parseInt(num2);

			if (operator.equals("add")) {
				 result = String.valueOf(Num1 + Num2);
				System.out.println("add(" + num1 + "," + num2 + ")=" + result);
			}
			if (operator.equals("sub")) {
				 result = String.valueOf(Num1 - Num2);
				System.out.println("sub(" + num1 + "," + num2 + ")=" + result);
			}
			if(operator.equals("max")) {
				if(Num1>Num2)
					result = String.valueOf(Num1);
				else
					result = String.valueOf(Num2);
				System.out.println("max(" + num1 + "," + num2 + ")=" + result);
			}
			if(operator.equals("min")) {
				if(Num1>Num2)
					result = String.valueOf(Num2);
				else
					result = String.valueOf(Num1);
				System.out.println("min(" + num1 + "," + num2 + ")=" + result);
			}
			return result;
		} else {
			int data1 = express.indexOf("(");
			int data2 = express.indexOf(")");

			String result="";
			String operator = express.substring(0, data1);
			String num = express.substring(data1 + 1, data2);

			int Num = Integer.parseInt(num);
			if (operator.equals("add")) {
				result = String.valueOf(Num * 2);
				System.out.println("add(" + num + ")=" + result);
			}
			return result;
		}
	}
}