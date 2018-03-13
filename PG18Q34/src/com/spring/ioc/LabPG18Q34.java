package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LabPG18Q34 {
	
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.cfg.xml");
		System.out.println("spring container started");
		Hello h=(Hello)ctx.getBean("hello");
		h.show();
	}
}
