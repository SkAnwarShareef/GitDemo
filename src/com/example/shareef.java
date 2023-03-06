package com.example;

public class shareef {
	static int currentBalance = 1000;


	public static void test() {
		System.out.println(currentBalance);

	}
	public void test1( ) {
		int deposite = currentBalance + 500;
		System.out.println(deposite);
	}
	public static void test2( ) {
		int getcurrentBalance = 1500;
		System.out.println(getcurrentBalance);
	}
	public static void main(String[] args) {
		test();
		shareef Shareef = new shareef();
		test2();
	}
	
}
