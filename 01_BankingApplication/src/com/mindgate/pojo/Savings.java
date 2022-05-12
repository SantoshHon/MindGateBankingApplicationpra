package com.mindgate.pojo;

public class Savings extends Account {
	private boolean isSalary;

	public Savings() {
		System.out.println("Default constructor of Savings");
	}

	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("Overloaded Constructor of Savings");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (isSalary && amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (isSalary == false && getBalance() - amount >= 1500) {
				setBalance(getBalance() - amount);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deposite(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "Savings [isSalary=" + isSalary + ", toString()=" + super.toString() + "]";
	}
}