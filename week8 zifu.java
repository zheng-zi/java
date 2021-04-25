package week83;

import java.util.Scanner;

public class zifu {
	public static void main(String[] args) {
		
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		
		Scanner scan = new Scanner(System.in);
		String express = scan.next();
		
		String array[] = express.split("\\+");
		
		float data1=Float.parseFloat(array[0]);
		float data2=Float.parseFloat(array[1]);
		
		float result = data1 + data2;
		
		System.out.println(result);
		
	}

}
