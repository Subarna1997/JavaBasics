package com.hcl.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
//		
//		List<User> userlist = new ArrayList<User>();
//		
//		userlist.add(new User("SUBARNA",12345,1234));
//		userlist.add(new User("SANU",12356,1234567));
//		userlist.add(new User("Joy",7893,1234));
		
		User user = new User("subarno",1234,123);
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("ENTER WHICH ACCOUNT YOU WANT CA OR, SA");
		String s2 = s1.next().toLowerCase();
		System.out.println(s2);
		if (s2.equals("ca")) {
			CA current = new CA();
			System.out.println("ENTER WHAT YOU WANT TO DO CREDIT OR, DEBIT");
			String s3 = s1.next().toLowerCase();
			System.out.println(s3);
			if (s3.equals("credit")) {
				System.out.println("ENTER THE AMMOUNT");
				int s4 = s1.nextInt();
				current.credit(user, s4);
				current.balance(user);
				System.out.println(user);
			} else {
				System.out.println("ENTER THE AMMOUNT");
				int s5 = s1.nextInt();
				if (user.getBalance() > 0) {
					current.debit(user, s5);
					current.balance(user);
					System.out.println(user);
				} else {
					System.out.println(user);
				}
			}
		} else {
			System.out.println("2");
		}

	}
}
