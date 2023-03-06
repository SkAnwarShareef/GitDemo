package com.example;

public class Bank {
	static int currentBalance = 1000;

	public static void main(String[] args) {
		tes1();
		test2();
		Bank bank = new Bank();
		bank.deposite(500);
	
		bank.bye();
		withdraw(200);
		
	}

	
	public static void tes1() {
		System.out.println("Hello, welcome");
	}
	public static void test2() {
		System.out.println(currentBalance);
	}
	public void deposite(int amount) {
		int deposite = currentBalance + amount;
		System.out.println(deposite);
	}
	public static void test3(int amount) {
		int currentBalance = currentBalance + amount;
		System.out.println(currentBalance);
	}
	public static void withdraw(int amount) {
		int withdraw = currentBalance - amount; 
		System.out.println(withdraw);
	}
	public void bye() {
		System.out.println("bye");
	}



	}
