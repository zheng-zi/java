package week6;

import java.util.Scanner;

public class SavingsAccount extends BankAccount{
	private double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double payInterest(){
		return super.getBalance()*this.interestRate;
	}

	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", getAccountNum()=" + getAccountNum()
				+ ", getBalance()=" + getBalance() + "]";
	}

}
