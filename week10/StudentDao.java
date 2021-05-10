package dao;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

import vo.Result;
import vo.Student;

public class StudentDao {
	public static ArrayList<Student> inputFromKeyBoard() {
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		System.out.println("请输入学生基本信息：");
		Scanner scan = new Scanner(System.in);
		String info = "";
		
		while(!(info = scan.nextLine()).equals("end")) {
			String stuArray[] = info.split(",|，");
			Student stu = new Student(stuArray[0], stuArray[1], stuArray[2], stuArray[3]);
			stuList.add(stu);
		}
		return stuList;
	}
	
	
	public static int statisticByGender(ArrayList<Student> stuList, String gender) {
		int count = 0;
		for(Student stu : stuList) {
			if(stu.getGender().equals(gender))
				count++;
		}
		return count;
	}
	
	public static  ArrayList<Result> statisticProvince(ArrayList<Student> stuList) {
		ArrayList<Result> resultList = new ArrayList<Result>();
		
		for(Student stu : stuList) {
			String province = stu.getProvince();
			String name = stu.getName();
			
			int index = isProvinceExist(resultList, province);
			if(index!=-1) {
				Result oldResilt = resultList.get(index);
				oldResilt.setCount(oldResilt.getCount()+1);
				oldResilt.setNames(oldResilt.getNames()+","+name);
				resultList.set(index, oldResilt);
			} else {
				Result result = new Result(province, 1, name);
				resultList.add(result);
			}
		}
		return resultList;
	}
	
	public static int isProvinceExist(ArrayList<Result> resultList, String province) {
		int index = -1;
		for(int i=0;i<resultList.size();i++) {
			Result result = resultList.get(i);
			if(result.getProvince().equals(province)) {
				index = i;
				return index;
			}
		}
		return index;
	}
	
	public static void output(ArrayList<Student> stuList, ArrayList<Result> resultList) {
		int totalCount = stuList.size();
		
		int maleCount = statisticByGender(stuList, "男");
		int femaleCount = statisticByGender(stuList, "女");
		
		System.out.println("总人数:"+totalCount);
		System.out.println("其中男:"+maleCount+"人,"+new Formatter().format("%.2f", maleCount*100.0f/totalCount)+"%, 女:"+femaleCount+"人,"
				+ new Formatter().format("%.2f", femaleCount*100.0f/totalCount) +"%");
		
		for(Result result : resultList) {
			System.out.println(result.toString());
		}
	}
}
