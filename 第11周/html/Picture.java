package vo;

public class Picture {
	private String PName;
	
	public Picture(String pName) {
		PName = pName;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public String toString() {
		return PName+" ";
	}
	
}
