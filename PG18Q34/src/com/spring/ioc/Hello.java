package com.spring.ioc;

public class Hello {

	private A aobj;
	private B bobj;
	
	public Hello(B bobj) {
		this.bobj = bobj;
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}
	
	public void show() {
		aobj.showFromA();
		bobj.showFromB();
	}
}
