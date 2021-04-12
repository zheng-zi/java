package week4;

public class jiOuGeShu {
	public static void main(String[] args) {
        int x[]= {1,2,3,4,5,6,7,8,9,10};
        int n1=0,n2=0;
        for(int i=0;i<10;i++) {
            if(x[i]%2!=0) {
                n1++;
            }else {
                n2++;
            }
        }
        System.out.println("数组中奇数个数为"+n1);
        System.out.println("数组中偶数个数为"+n2);
    }
}
