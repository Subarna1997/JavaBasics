package com.hcl.model;

public class User {
	
	private String name;
    private int accountNo;
    private int password;
    private double balance;
	
    public User() {
		super();
	}

	public User(String name, int accountNo, int password) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.password = password;
		this.balance = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", accountNo=" + accountNo + ", password=" + password + ", balance=" + balance
				+ "]";
	}

    
}
