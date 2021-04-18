package week7;

public class Student {
	private String id;
	private String name;
	
	
	public Student() {
		super();
	}

	Student(String id, String name) {
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

	public String toString() {
		return "id=" + id + ", name=" + name;
	}
	
	public void tostring(){
		System.out.println(" id=" + id + ", name=" + name);
	}
}