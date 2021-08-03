package com.hcl.model;

public interface Account {

	public void debit(User user, double ammount);
	public void credit(User user, double ammount);
	public void balance(User user);
}
