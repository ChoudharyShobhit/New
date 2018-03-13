package com.spring.ioc;

public class A {

    private int a; 
    private int c;
    private String msg;
    
	public void setA(int a) {
		this.a = a;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void showFromA() {
		System.out.println(a);
		System.out.println(msg);
	}
}
