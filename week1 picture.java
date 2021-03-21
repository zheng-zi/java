package week;

import java.util.Scanner;

public class picture {
	public static void main(String[] a) {
		//定义
		int frames;
		int framesColor;
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
		System.out.println("请输入边框的类型(regular选0 or fancy选1)：");
		scan.nextLine();
		frames = scan.nextInt();
		System.out.println("请输入对边框颜色的选择(wight选0 or otherColor选1)：");
		framesColor = scan.nextInt();
		System.out.println("请输入皇冠的数量：");
		crownNumber = scan.nextInt();
		
		//处理
		int regular=0 ,fancy=1;
		if(frames==0) {
			lengthDollars=0.3f;widthDollars=0.3f;  //两倍的长和宽
		}else {
			lengthDollars=0.5f;widthDollars=0.5f;  //两倍的长和宽
		}
		int wight=0 ,otherColor=1;
		if(framesColor==0) {
			framesColorDollars=0;
		}else {
			framesColorDollars=0.1f;
		}
		cardboard=0.02f;glass=0.07f;
		crownDollar=0.35f;
		area = length*width;
		total =  (length+width)*(lengthDollars+framesColorDollars)+area*(cardboard+glass)+crownNumber*crownDollar;
		
		System.out.println("总价："+total);
	}

}