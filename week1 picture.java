package week;

import java.util.Scanner;

public class picture {
	public static void main(String[] a) {
		//����
		int frames;
		int framesColor;
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
		System.out.println("������߿������(regularѡ0 or fancyѡ1)��");
		scan.nextLine();
		frames = scan.nextInt();
		System.out.println("������Ա߿���ɫ��ѡ��(wightѡ0 or otherColorѡ1)��");
		framesColor = scan.nextInt();
		System.out.println("������ʹڵ�������");
		crownNumber = scan.nextInt();
		
		//����
		int regular=0 ,fancy=1;
		if(frames==0) {
			lengthDollars=0.3f;widthDollars=0.3f;  //�����ĳ��Ϳ�
		}else {
			lengthDollars=0.5f;widthDollars=0.5f;  //�����ĳ��Ϳ�
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
		
		System.out.println("�ܼۣ�"+total);
	}

}