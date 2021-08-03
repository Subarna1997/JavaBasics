package com.hcl.model;

import java.util.ArrayList;
import java.util.List;

public class CA implements Account{

	
	@Override
	public void debit(User user, double ammount) {
		// TODO Auto-generated method stub
		user.setBalance(user.getBalance()- ammount);
		
	}

	@Override
	public void credit(User user, double ammount) {
		// TODO Auto-generated method stub

		user.setBalance(user.getBalance()+ ammount);
	}

	@Override
	public void balance(User user) {
		// TODO Auto-generated method stub
		user.getBalance();
		
	}
	
	
    
 
  
	

	
    
    

}
