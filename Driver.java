package week7;

import java.util.Scanner;

public class Driver {
		private static Enrollment enrollment;

		public static void main(String[] args) {
			int choice = menu();
			while (choice != 5) {
				switch (choice) {
				case 1:
					createSubject();
					break;
				case 2:
					addSubject();
					break;
				case 3:
					withDraw();
					break;
				case 4:
					printDetail();
					break;
				default:
					System.out.println("error");
				}
				choice = menu();
			}
			System.out.println("��~"+"\n"+"��ӭ�´�ʹ�ã�");
		}
	

		public static int menu() {
			int choice = 0;
			System.out.println("===================WTUѡ��ϵͳ===================");
			System.out.println("1.�����γ�");
			System.out.println("2.ѡ��");
			System.out.println("3.��ѡ");
			System.out.println("4.��ӡ����");
			System.out.println("5.�˳�");
			System.out.println("==============================================");
			System.out.println("��ѡ��1-5��");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			return choice;
		}

		public static void createSubject() {
			Scanner scan = new Scanner(System.in);
			if(enrollment!=null) {
				System.out.println("�γ��Ѵ��ڣ��Ƿ����´���(y/n):");
				String a = scan.next();
				if(a.equals("n")) {
					return;
			}
			}
			System.out.println("������γ�id��");
			String subjid = scan.next();
			System.out.println("������γ����ƣ�");
			String subjName = scan.next();
			System.out.println("������γ�������");
			int maxNum = scan.nextInt();

			Subject subj = new Subject(subjid, subjName, maxNum);
			enrollment = new Enrollment(subj);
			System.out.println("�γ̴����ɹ�����Ϣ���£�");
			System.out.println(subj.toString());

		}

		public static void addSubject() {
			if(enrollment==null){
				System.out.println("���ȴ����γ�");
				return;
			}
			if(enrollment.size()==enrollment.getNUM()){
				System.out.println("�Ѵﵽ���������������ѡ��");
				return;
			}
			Scanner scan = new Scanner(System.in);
			
			System.out.println("������ѧ����id��");
			String id = scan.next();
			System.out.println("������ѧ����������");
			String name = scan.next();
			
			Student stu = new Student(id,name);
			enrollment.addStudent(stu);
			System.out.println("��ϲ�㣬ѡ�γɹ���");
			System.out.println("Ŀǰѡ��������£�");
			System.out.println(enrollment.toString());
		}

		public static void withDraw() {
			if(enrollment==null){
				System.out.println("���ȴ����γ�");
				return;
			}
			if(enrollment.size()==0){
				System.out.println("����ѡ�ÿγ̣��޷���ѡ��");
				return;
			}
			Scanner scan = new Scanner(System.in);
			
			System.out.println("��������ѡ��ѧ��id");
			String id = scan.next();
			enrollment.remove(id);
			System.out.println(enrollment.toString());
		}

		public static void printDetail() {
			System.out.println(enrollment.toString());

	}

}