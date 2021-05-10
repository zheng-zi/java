
package Student;

import java.util.ArrayList;

import dao.StudentDao;
import vo.Result;
import vo.Student;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao studentDao = new StudentDao();
		ArrayList<Student> stuList = studentDao.inputFromKeyBoard();
		ArrayList<Result> resultList = studentDao.statisticProvince(stuList);
		studentDao.output(stuList, resultList);
	}

}