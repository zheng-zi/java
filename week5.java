package week5;

import java.util.Scanner;

public class ClassListDriver {

	private static ClassList list = null;

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 3) {
			switch (choose) {
			case 1:createList();break;
			case 2:printList();break;
			default:System.out.println("无效的选择！");
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用！");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("====WTU课程管理系统========");
		System.out.println("1.Create List");
		System.out.println("2.Print List");
		System.out.println("3.Exit");
		System.out.print("please choose(1-2):");
		Scanner scan=new Scanner(System.in);
		choose = scan.nextInt();

		return choose;
	}

	public static void createList() {
		Scanner scan=new Scanner(System.in);
		if(list !=null){
			System.out.print("课程已经创建，是否重新创建(y/n):");
			String again = scan.next();
			if(again.equalsIgnoreCase("n")){  
				return;
			}
		}
		
		System.out.print("请输入学年:");
		int year = scan.nextInt();
		System.out.print("请输入学期(1,2):");
		int semester = scan.nextInt();
		
		System.out.print("请输入课程代码:");
		String subId=scan.next();
		System.out.print("请输入课程名称:");
		String subName=scan.next();
		Subject subj=new Subject(subId,subName);
		
		System.out.print("请输入学生1学号:");
		String s1Id=scan.next();
		System.out.print("请输入学生1姓名:");
		String s1Name=scan.next();
		System.out.print("请输入学生2学号:");
		String s2Id=scan.next();
		System.out.print("请输入学生2姓名:");
		String s2Name=scan.next();
		Student s1=new Student(s1Name,s1Id);
		Student s2=new Student(s2Name,s2Id);
		
		list = new ClassList(year,semester,subj,s1,s2);

	}

	public static void printList() {
		
		if(list == null){
			System.out.println("请先执行第一步！");
			return;
		}
		
		System.out.println(list.toString());
	}
}


package week5;

public class ClassList {
	private int year;
	private int semester;
	private Subject sub;
	private Student s1;
	private Student s3;
	public ClassList() {
		super();
	}
	public ClassList(int year, int semester, Subject sub, Student s1, Student s3) {
		super();
		this.year = year;
		this.semester = semester;
		this.sub = sub;
		this.s1 = s1;
		this.s3 = s3;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	public Student getS3() {
		return s3;
	}
	public void setS3(Student s3) {
		this.s3 = s3;
	}
	
	public String toString() {
		String info="";
		info=this.year+"学年"+this.semester+"学期\n";
		info+=this.sub.toString()+"\n";
		info+="学号\t姓名\n";
		info+="========================\n";
		info+=this.s1.toString()+"\n";
		info+=this.s3.toString();
		return info;
	}
}


package week5;

public class Student {
	private String name;
	private String id;
	public Student() {
		super();
	}
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return this.id+"\t"+this.name;
	}
}


package week5;

public class Subject {
	private String id;
	private String name;
	
	public Subject() {
		super();
	}

	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String info="";
		info = "课程代码:"+this.id+"\t"+"课程名称:"+this.name;
		return info;
	}
	
}

