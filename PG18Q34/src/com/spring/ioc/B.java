package com.spring.ioc;

public class B {

	private int b;
	private String str;
	
	public B(int b, String str) {
		this.b = b;
		this.str = str;
	}
	
	public void showFromB() {
		System.out.println(b);
		System.out.println(str);
	}
}
