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
			System.out.println("拜~"+"\n"+"欢迎下次使用！");
		}
	

		public static int menu() {
			int choice = 0;
			System.out.println("===================WTU选课系统===================");
			System.out.println("1.创建课程");
			System.out.println("2.选课");
			System.out.println("3.退选");
			System.out.println("4.打印名单");
			System.out.println("5.退出");
			System.out.println("==============================================");
			System.out.println("请选择（1-5）");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			return choice;
		}

		public static void createSubject() {
			Scanner scan = new Scanner(System.in);
			if(enrollment!=null) {
				System.out.println("课程已存在，是否重新创建(y/n):");
				String a = scan.next();
				if(a.equals("n")) {
					return;
			}
			}
			System.out.println("请输入课程id：");
			String subjid = scan.next();
			System.out.println("请输入课程名称：");
			String subjName = scan.next();
			System.out.println("请输入课程人数：");
			int maxNum = scan.nextInt();

			Subject subj = new Subject(subjid, subjName, maxNum);
			enrollment = new Enrollment(subj);
			System.out.println("课程创建成功，信息如下：");
			System.out.println(subj.toString());

		}

		public static void addSubject() {
			if(enrollment==null){
				System.out.println("请先创建课程");
				return;
			}
			if(enrollment.size()==enrollment.getNUM()){
				System.out.println("已达到最大人数，不能再选！");
				return;
			}
			Scanner scan = new Scanner(System.in);
			
			System.out.println("请输入学生的id：");
			String id = scan.next();
			System.out.println("请输入学生的姓名：");
			String name = scan.next();
			
			Student stu = new Student(id,name);
			enrollment.addStudent(stu);
			System.out.println("恭喜你，选课成功！");
			System.out.println("目前选课情况如下：");
			System.out.println(enrollment.toString());
		}

		public static void withDraw() {
			if(enrollment==null){
				System.out.println("请先创建课程");
				return;
			}
			if(enrollment.size()==0){
				System.out.println("无人选该课程，无法退选！");
				return;
			}
			Scanner scan = new Scanner(System.in);
			
			System.out.println("请输入退选的学生id");
			String id = scan.next();
			enrollment.remove(id);
			System.out.println(enrollment.toString());
		}

		public static void printDetail() {
			System.out.println(enrollment.toString());

	}

}