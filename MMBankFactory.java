package com.Bank;

 class MMBankFactory extends BankFactory{

	@Override
	public SavingsAcc getNewSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		System.out.println("MMBANKFACTORY: Get the new account");
		System.out.println("Account No:"+accNo+ "Account name:"+accNm+ "Account Balance :"+accBal+ "isSalaried:"+isSalaried);
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float crediLimit) {
		// TODO Auto-generated method stub
		System.out.println("MMBANKFACTORY: Get the new account");
		int creditLimit = 0;
		System.out.println("Account No:"+accNo+ "Account name:"+accNm+ "Account Balance :"+accBal+"CreditLimit:"+creditLimit++);
		System.out.println("===============================================================================");
		return null;
	}
	 

}
