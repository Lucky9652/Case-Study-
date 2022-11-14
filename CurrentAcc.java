package com.Bank;

 abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
		this.creditLimit=creditLimit;
		System.out.println("CURRENT ACCOUNT:");
		System.out.println("Account No:"+accNo+ "Account name:"+accNm+ "Account Balance :"+accBal+"CreditLimit:"+creditLimit++);
	}
 
@Override
public void withdraw(float accBal) {
	
	System.out.println("Withdraw amount is:"+accBal);
	}
@Override
public String toString() {
	String accNm="karthik Munikrishna";
	System.out.println(accNm.toString());
	return null;
	
}

public float getCreditLimit() {
	return creditLimit;
}
}
