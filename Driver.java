package week6;

import java.util.Scanner;

public class Driver {
	public static int save=0,check=0;
	public static Customer customer = new Customer();
	
	public static void main(String[] args) {
		int choice = menu();
		while(choice!=8){
			switch(choice){
			case 1:create();break;
			case 2:
				if(save==0) {
					System.out.println("��ѯ�������п������Ƚ��п���������");
					break;
				}
				save();
				break;
			case 3:
				if(save==0) {
					System.out.println("��ѯ�������п������Ƚ��п���������");
					break;
				}
				withdraw();
				break;
			case 4:
				if(check==0) {
					System.out.println("��ѯ�������ÿ������Ƚ��п���������");
					break;
				}
				comsume();
				break;
			case 5:
				if(check==0) {
					System.out.println("��ѯ�������ÿ������Ƚ��п���������");
					break;
				}
				repay();
				break;
			case 6:
				if(check==0&&save==0) {
					System.out.println("��ѯ�����������Ƚ��п���������");
					break;
				}
				settle();
				break;
			case 7:
				if(check==0&&save==0) {
					System.out.println("��ѯ�����������Ƚ��п���������");
					break;
				}
				balance();
				break;
			default:
				System.out.println("��ѡ����ȷ��ָ�");
			}
			choice = menu();
		}

	}
	
	public static int menu(){
		int choice=0;
		System.out.println("1.����");
		System.out.println("2.���");
		System.out.println("3.ȡ��");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("6.���н���");
		System.out.println("7.��ѯ���");
		System.out.println("8.�˳�");
		System.out.println("��ѡ��1-8");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static int menu2(){
		int choice=0;
		System.out.println("1.���ÿ�");
		System.out.println("2.�洢��");
		System.out.println("3.����");
		System.out.println("��ѡ��1-3");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	
	public static void create(){
		int choice=menu2(); 
		while(choice!=3){
		switch(choice){	
			case 1:
				checkingAccount();
				check = 1;
				break;
			case 2:
				savingAccount();
				save = 1;
				break;
			default:
				System.out.println("error");
		}
		choice = menu2();
		}
	}
	
	public static void save(){
		System.out.println("���濪ʼ������");
		Scanner scan = new Scanner(System.in);
		System.out.println("����������");
		double money = scan.nextDouble();
		customer.setSavingMoney(money);
	}
	
	public static void withdraw(){
		Scanner scan = new Scanner(System.in);
		System.out.println("������ȡ����");
		double money = scan.nextDouble();
		if(money>customer.getSavingsAccount()) {
			System.out.println("���㣬���ȴ�");
			return;
		}
		money = -money;
		customer.setSavingMoney(money);
	}
	
	public static void comsume(){
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ѽ��");
		double money = scan.nextDouble();
		customer.setCheckingMoney(money);
	}
	
	public static void repay(){
		Scanner scan = new Scanner(System.in);
		System.out.println("�����뻹����");
		double money = scan.nextDouble();
		money = -money;
		customer.setCheckingMoney(money);
	}
	
	public static void settle(){
		if(save==1&&check==1) {
			
			System.out.println("���ÿ�����ѽ��㣺"+customer.getCheckingSettle());
			System.out.println("�洢�����ʽ��㣺"+customer.getSavingsSettle());
		}else if(save==1&&check==0) {
			System.out.println("�洢�����ʽ��㣺"+customer.getSavingsSettle());
		}else if(save==0&&check==1) {
			System.out.println("���ÿ�����ѽ��㣺"+customer.getCheckingSettle());
		}
	}
	
	public static void balance(){
		if(save==1&&check==1) {
			System.out.println(customer.toString());
		}else if(save==1&&check==0) {
			System.out.println(customer.SAtoString());
		}else if(save==0&&check==1) {
			System.out.println(customer.CAtoString());
		}
		
		
	}
	
	public static void checkingAccount(){
		Scanner scan = new Scanner(System.in);
		if(customer.getSsn()==null) {
			System.out.println("�����뿪�������֤�ţ�");
			String ssn = scan.next();
			System.out.println("�����뻧��������");
			String name = scan.next();
			
			customer.setSsn(ssn);
			customer.setName(name);
		}
		System.out.println("�������˻��ţ�");
		String num = scan.next();
		System.out.println("�����������ã�");
		double serviceCharge = scan.nextDouble();
		
		CheckingAccount ca = new CheckingAccount(num,0,serviceCharge);
		
		customer.setCheckingAccount(ca);
		check = 1;
	}
	
	public static void savingAccount(){
		Scanner scan = new Scanner(System.in);
		if(customer.getSsn()==null) {
			System.out.println("�����뿪�������֤�ţ�");
			String ssn = scan.next();
			System.out.println("�����뻧��������");
			String name = scan.next();
			
			customer.setSsn(ssn);
			customer.setName(name);
		}
		System.out.println("�������˻��ţ�");
		String accountNum = scan.next();
		System.out.println("���������ʣ�");
		double interestRate = scan.nextDouble();
		
		SavingsAccount sa = new SavingsAccount(accountNum,0,interestRate);
		
		customer.setSavingsAccount(sa);
		save = 1;
	}
}