package com.javalec.ex;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CatsMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:catsApplication.xml");
		Cats myCat = ctx.getBean("cats", Cats.class);
		myCat.getCatsInfo();
		
	}
}
