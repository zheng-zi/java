package week4;

public class laiJia {
	public static void main(String[] a){
		int sum=1;
		for(int i=2;i<=30;i++){
			for(int j=i;j>=2;j--)
			{
				int tmp=j*(j-1);
				sum=sum+tmp;
			}
		}
		System.out.println("1!+2!+...+30!="+sum);
	}
}