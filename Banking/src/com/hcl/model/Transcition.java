//package com.hcl.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Transcition {
//	 private String choice;
//	    private CA ca;
//	    private SA sa;
//	    private List<User> userCAList;
//	    private List<User> userSAList;
//
//	    public Transcition() {
//	        ca = new CA();
//	        sa = new SA();
//	        userCAList = new ArrayList<User>();
//	        userSAList = new ArrayList<User>();
//	    }
//
//	    public void setAccountType(String choice){
//	        this.choice = choice;
//	    }
//	    public String getAccountType(){
//	       return choice;
//	    }
//	   public User addUser(User user){
//	      if (getAccountType().equals("ca")){
//	        //userCAList = ca.getUsers();
//	        userCAList.add(user);
//	        return user;
//	      }
//	      else if(getAccountType().equals("sa")){
//	          //userSAList = sa.getUsers();
//	          userSAList.add(user);
//	          return user;
//
//	      }
//	      else {
//	          return null;
//	      }
//	   }
//
//
//
//}
