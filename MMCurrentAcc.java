package com.Bank;

 class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
		System.out.println("MMSAVING ACCOUNT");
		System.out.println("Account No:"+accNo+ "Account name:"+accNm+ "Account Balance :"+accBal+"CreditLimit:"+creditLimit++);
	}
	@Override
	public void withdraw(float accBal) {
		System.out.println("withdraw amount:" +accBal);
		
	}
@Override

public String toString() {
	String str="NETHRA NISHA";
	System.out.println(str);
	return null;
	
}

} 
