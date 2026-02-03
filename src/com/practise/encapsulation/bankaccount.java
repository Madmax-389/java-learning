package com.practise.encapsulation;
class Account{
	
	private long accountNumber;
	private String holderName;
	private long balance; 
	
	public void setacc(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public long getacc() {
		return accountNumber;
	}
	
	public void setname(String holderName) {
		this.holderName=holderName;
		
	}
	
	public String getname() {
		return holderName;
	}
	public void setbal(long balance) {
		this.balance=balance;
	}
	public long getbal() {
		return balance;
	}
	
}
public class bankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
