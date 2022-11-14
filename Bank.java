package com.Bank;

public  class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MMBankFactory a1=new MMBankFactory();
		a1.getNewSavingsAcc(765433322, "KARTHIK MUNIKRISHNA", 700000.0F, true);
		a1.getNewCurrentAcc(765432876,"Karthik Munikrishna", 876543.0F, 8765487.0F);
		 
		MMSavingAcc a2=new MMSavingAcc(90000,"KARTHIK MUNIKRISHNA",889988.0F,true);
		a2.withdraw(70000.0F);
		a2.withdraw(60000.0F);
		a2.toString();
	
		MMCurrentAcc a3=new MMCurrentAcc(9876567,"NETHRA NISHA",800000.0F,90000.0F);
		a3.withdraw(56000.0F);
		a3.deposit(87654.0F);
		a3.toString();
	
	}
	
		

	}


