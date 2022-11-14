package com.Bank;

 abstract class BankAcc {///step 1 is creating abstract class 
	private int accNo;
	private String accNm;
	private  float accBal;
	
	
	public BankAcc(int accNo,String accNm,float accBal) {//step 2 Constructor creating 
		super();
		}
	{	
		System.out.println(accNo+"   "+accNm+" "+" "+accBal);
		this.accNo=(accNo);
		this.accNm=accNm;
		this.accBal=accBal;
	}
	
	public void withdraw() {//step 3
	}
	public  void withdraw(float accBal) {
	}
	
	public void deposit(float accBal) {
		System.out.println("Amount  withdraw accBal " + accBal);
		}
	@Override
	public String toString() {//Step 4
		return accNm;
		}
	
		
	}
	
