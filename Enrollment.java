package week7;

public class Enrollment {

	private Student[] list;
	private Subject subj;
	private int count;
	
	public Enrollment(Subject subj){
		count = 0;
		this.subj = subj;
		list = new Student[subj.getMaxNum()];
	}
	
	
	public Student[] getList() {
		return list;
	}

	public void setList(Student[] list) {
		this.list = list;
	}

	public Subject getSubj() {
		return subj;
	}
	
	public int getNUM(){
		return subj.getMaxNum();
	}
	
	public void setSubj(Subject subj) {
		this.subj = subj;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean addStudent(Student stu){
		if(stu==null){
			return false;
		}
		if(list.length<=count){
			return false;
		}
		list[count] = stu;
		count++;
		return true;
	}
	
	public boolean remove(String id){
		int index = 2*count;
		for(int i=0;i<list.length&&list[i]!=null;i++){
			if(list[i].getId().equals(id))
				index = i;
		}
		if(index==2*count){
			System.out.println("抱歉，学号为"+id+"的学生并没有选课！");
			return false;
		}
		for(int i=index;i<count-1;i++){
			list[i] = list[i+1];
			System.out.println("list"+i+"=list"+(i+1));
		}
		list[count-1] = null;
		count--;
		System.out.println("退选成功！新的选课信息如下：");
		return true;
	}
	
	public int indexOf(String id){
		for(int i=0;i<list.length&&list[i]!=null;i++){
			if(list[i].getId().equals(id))
				return i;
		}
		return -1;
	}
	
	public Student get(int index){
		return list[index];
	}
	
	public int size(){
		return count;
	}
	
	public String toString(){
		String info="";
		info = subj.toString()+"\n";
		info = info +"选课人数:"+this.count+"\n";
		info = info + "学生ID\t"+"学生姓名"+"\n";
		for(int i=0;i<count;i++){
			info+=list[i].toString()+"\n";
		}
		return info;
	}
	
}