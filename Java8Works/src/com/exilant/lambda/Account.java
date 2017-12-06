package com.exilant.lambda;

public class Account {
	private int accId;
	private double balance;
	private String custName; 
	private String sex;
	
	
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", balance=" + balance + ", custName=" + custName + ", sex=" + sex + "]";
	}

	public Account(){}
	
	public Account(int accId, double balance, String custName, String sex) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.custName = custName;
		this.sex = sex;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	} 
	
	
}
