package com.Bank;

public  class MMSavingAcc {
	private static final float MINBAL=0;
	private float amount;
	public MMSavingAcc(int accNm, String accNo, float accBal, boolean isSalaried) {
		super();
		System.out.println("Account No:"+accNo+ "Account name:"+accNm+ "Account Balance :"+accBal+ "isSalaried:"+isSalaried);
	}
	public void withdraw(float accBal) {
		//System.out.println("ENTER THE ACCOUNT BALANCE");
		accBal=accBal-amount;
		System.out.println("withdraw amount : "+accBal);
	}
	@Override
	public String toString() {
		return null;
		
	}
	public static float getMinbal() {
		return MINBAL;
	}

}
