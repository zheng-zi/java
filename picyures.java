package pictures;

import java.util.Scanner;

public class picyures {
	public static void main(String[] a) {
		//����
		String frames;
		String framesColor;
		float framesColorDollars;
		float length ,width ,area;
		float lengthDollars ,widthDollars;
		float cardboard ,glass;
		int crownNumber;
		float crownDollar;
		float total;
		
		//����
		Scanner scan=new Scanner(System.in);
		System.out.println("������ͼƬ�ĳ��ȺͿ�ȣ���Ӣ��Ϊ��λ����");
		length = scan.nextFloat();
		width = scan.nextFloat();
		System.out.println("������߿������(regular or fancy)��");
		scan.nextLine();
		frames = scan.nextLine();
		System.out.println("������Ա߿���ɫ��ѡ��");
		framesColor = scan.nextLine();
		System.out.println("������ʹڵ�������");
		crownNumber = scan.nextInt();
		
		//����
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
		
		System.out.println("�ܼۣ�"+total);
	}

}
