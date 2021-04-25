package week84;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		
		Scanner scan = new Scanner(System.in);
		String express = scan.nextLine();
		
		int pos1 = express.indexOf("(");
		
		String operateCode = express.substring(0,pos1);
		
		int pos2,pos3;
		double number1,number2 = 0;
		pos2 = express.indexOf(",");
		pos3 = express.indexOf(")");
		
		if(operateCode.equals("doubleMe")) {
			String operateNumber = express.substring(pos1+1,pos3);
			number1 = Double.parseDouble(operateNumber);
		}
		else {
			String operateNumber1 = express.substring(pos1+1,pos2);
			number1 = Double.parseDouble(operateNumber1);
			String operateNumber2 = express.substring(pos2+1,pos3);
			number2 = Double.parseDouble(operateNumber2);	
		}

		double result = 0;
		switch(operateCode) {
		case "doubleMe":
			result = number1*2 ;break;
			
		case "add":
			result = number1 + number2;break;
			
		case "sub":
			result = number1 - number2;break;
		case "max":
			if(number1>=number2)
				result = number1;
			else
				result = number2;
			break;
		case "min":
			if(number1<=number2)
				result = number1;
			else
				result = number2;
			break;
			
		}
		
		String info = " ";
		info = express;
		System.out.println(info+"="+result);
	}

}
