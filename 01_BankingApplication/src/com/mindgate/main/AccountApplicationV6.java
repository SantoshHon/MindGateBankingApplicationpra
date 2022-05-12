package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationV6 {
	public static void main(String[] args) {
		Current current = new Current(101, "Santosh", 10000, 40000);
		System.out.println(current);
		System.out.println("Withdraw : 5000");
		current.withdraw(5000);
		System.out.println(current);//overdraft: 50000 and balance 10000
		System.out.println();
		System.out.println("Withdraw : 20000");
		current.withdraw(20000);
		System.out.println(current);//overdraft: 35000 and balance 0
		System.out.println();
		System.out.println("Deposite : 5000");
		current.deposite(5000);
		System.out.println(current);//overdraft: 40000 and balance 0
		System.out.println();
		System.out.println("Deposite : 15000");
		current.deposite(15000);
		System.out.println(current);//overdraft: 50000 and balance 5000

}
}