package week6;

public class Customer {
	private String ssn;
	private String name;
	CheckingAccount checkingAccount;
	SavingsAccount savingsAccount;

	
	public Customer() {
		super();
	}

	public Customer(String ssn, String name, CheckingAccount checkingAccount, SavingsAccount savingsAccount) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.checkingAccount = checkingAccount;
		this.savingsAccount = savingsAccount;
	}

	public void setSavingMoney(double money) {
		savingsAccount.setBalance(savingsAccount.getBalance()+money);
	}
	
	public void setCheckingMoney(double money) {
		checkingAccount.setBalance(checkingAccount.getBalance()-money);
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCheckingAccount() {
		return checkingAccount.getBalance();
	}
	
	public double getCheckingSettle() {
		checkingAccount.setBalance(checkingAccount.getBalance()-checkingAccount.assessServiceCharge());
		return checkingAccount.assessServiceCharge();
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public double getSavingsAccount() {
		return savingsAccount.getBalance();
	}

	public double getSavingsSettle() {
		savingsAccount.setBalance(savingsAccount.getBalance()+savingsAccount.payInterest());
		return savingsAccount.payInterest();
	}
	
	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public String toString() {
		String a = "";
		a = "–≈”√ø®”‡∂Ó£∫"+ checkingAccount.getBalance();
		a+= "\n¥Ê¥¢ø®”‡∂Ó£∫"+ savingsAccount.getBalance();
		return a;
	}
	
	public String SAtoString() {
		String a = "";
		a+= "\n¥Ê¥¢ø®”‡∂Ó£∫"+ savingsAccount.getBalance();
		return a;
	}
	
	public String CAtoString() {
		String a = "";
		a = "–≈”√ø®”‡∂Ó£∫"+ checkingAccount.getBalance();
		return a;
	}

}
