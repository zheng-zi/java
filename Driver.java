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
					System.out.println("查询不到银行卡，请先进行开户操作！");
					break;
				}
				save();
				break;
			case 3:
				if(save==0) {
					System.out.println("查询不到银行卡，请先进行开户操作！");
					break;
				}
				withdraw();
				break;
			case 4:
				if(check==0) {
					System.out.println("查询不到信用卡，请先进行开户操作！");
					break;
				}
				comsume();
				break;
			case 5:
				if(check==0) {
					System.out.println("查询不到信用卡，请先进行开户操作！");
					break;
				}
				repay();
				break;
			case 6:
				if(check==0&&save==0) {
					System.out.println("查询不到卡，请先进行开户操作！");
					break;
				}
				settle();
				break;
			case 7:
				if(check==0&&save==0) {
					System.out.println("查询不到卡，请先进行开户操作！");
					break;
				}
				balance();
				break;
			default:
				System.out.println("请选择正确的指令！");
			}
			choice = menu();
		}

	}
	
	public static int menu(){
		int choice=0;
		System.out.println("1.开户");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.消费");
		System.out.println("5.还款");
		System.out.println("6.银行结算");
		System.out.println("7.查询余额");
		System.out.println("8.退出");
		System.out.println("请选择1-8");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static int menu2(){
		int choice=0;
		System.out.println("1.信用卡");
		System.out.println("2.存储卡");
		System.out.println("3.返回");
		System.out.println("请选择1-3");
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
		System.out.println("下面开始存款服务");
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入存款金额");
		double money = scan.nextDouble();
		customer.setSavingMoney(money);
	}
	
	public static void withdraw(){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入取款金额");
		double money = scan.nextDouble();
		if(money>customer.getSavingsAccount()) {
			System.out.println("余额不足，请先存款！");
			return;
		}
		money = -money;
		customer.setSavingMoney(money);
	}
	
	public static void comsume(){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入消费金额");
		double money = scan.nextDouble();
		customer.setCheckingMoney(money);
	}
	
	public static void repay(){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入还款金额");
		double money = scan.nextDouble();
		money = -money;
		customer.setCheckingMoney(money);
	}
	
	public static void settle(){
		if(save==1&&check==1) {
			
			System.out.println("信用卡服务费结算："+customer.getCheckingSettle());
			System.out.println("存储卡利率结算："+customer.getSavingsSettle());
		}else if(save==1&&check==0) {
			System.out.println("存储卡利率结算："+customer.getSavingsSettle());
		}else if(save==0&&check==1) {
			System.out.println("信用卡服务费结算："+customer.getCheckingSettle());
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
			System.out.println("请输入开户人身份证号：");
			String ssn = scan.next();
			System.out.println("请输入户主姓名：");
			String name = scan.next();
			
			customer.setSsn(ssn);
			customer.setName(name);
		}
		System.out.println("请输入账户号：");
		String num = scan.next();
		System.out.println("请输入服务费用：");
		double serviceCharge = scan.nextDouble();
		
		CheckingAccount ca = new CheckingAccount(num,0,serviceCharge);
		
		customer.setCheckingAccount(ca);
		check = 1;
	}
	
	public static void savingAccount(){
		Scanner scan = new Scanner(System.in);
		if(customer.getSsn()==null) {
			System.out.println("请输入开户人身份证号：");
			String ssn = scan.next();
			System.out.println("请输入户主姓名：");
			String name = scan.next();
			
			customer.setSsn(ssn);
			customer.setName(name);
		}
		System.out.println("请输入账户号：");
		String accountNum = scan.next();
		System.out.println("请输入利率：");
		double interestRate = scan.nextDouble();
		
		SavingsAccount sa = new SavingsAccount(accountNum,0,interestRate);
		
		customer.setSavingsAccount(sa);
		save = 1;
	}
}