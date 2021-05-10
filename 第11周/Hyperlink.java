package vo;

public class Hyperlink {
	private String HName;
	private String HSite;
	
	public Hyperlink(String hName, String hSite) {
		HName = hName;
		HSite = hSite;
	}
	public String getHName() {
		return HName;
	}
	public void setHName(String hName) {
		HName = hName;
	}
	public String getHSite() {
		return HSite;
	}
	public void setHSite(String hSite) {
		HSite = hSite;
	}
	public String toString() {
		return HName+"\t"+HSite;
	}
	
}
