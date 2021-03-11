package pictures;

import java.util.Scanner;

public class picyures {
	public static void main(String[] a) {
		//定义
		String frames;
		String framesColor;
		float framesColorDollars;
		float length ,width ,area;
		float lengthDollars ,widthDollars;
		float cardboard ,glass;
		int crownNumber;
		float crownDollar;
		float total;
		
		//输入
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入图片的长度和宽度（以英寸为单位）：");
		length = scan.nextFloat();
		width = scan.nextFloat();
		System.out.println("请输入边框的类型(regular or fancy)：");
		scan.nextLine();
		frames = scan.nextLine();
		System.out.println("请输入对边框颜色的选择：");
		framesColor = scan.nextLine();
		System.out.println("请输入皇冠的数量：");
		crownNumber = scan.nextInt();
		
		//处理
		String regular = null,fancy;
		if(frames==regular) {
			lengthDollars=0.15f;widthDollars=0.15f;
		}else {
			lengthDollars=0.25f;widthDollars=0.25f;
		}
		String wight = null;
		if(framesColor!=wight) {
			framesColorDollars=0;
		}else {
			framesColorDollars=(float) 0.1;
		}
		cardboard=0.02f;glass=0.07f;
		crownDollar=0.35f;
		area = length*width;
		total = (length+width)*(lengthDollars+framesColorDollars)+area*(cardboard+glass)+crownNumber*crownDollar;
		
		System.out.println("总价："+total);
	}

}
