package com.Bank;

abstract class SavingsAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAl=0;
	public int amount;
	public SavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried, float MINBAl) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	    this.isSalaried=isSalaried;
	    System.out.println("SAVINGS ACCOUNT");
	    System.out.println("Account no:"+accNo+ "Account name:"+accNm+ "Account Bal:"+accBal++ );
	   }
@Override
public  void withdraw(float accBal) {
	System.out.println("Enter the Account Balance:");
	accBal=accBal-amount;
	System.out.println("Amount is withdraw with accBal : "+accBal);
}
@Override
public String toString() {
	String str="KARTHIK MUNIKRISHNA";
	System.out.println(str.toString());
	return str;
	
}
}
