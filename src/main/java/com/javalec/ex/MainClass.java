package com.javalec.ex;

//AOP xml파일에서 설정하여 출력하는 예제
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX2.xml");
		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();
		ctx.close();
	}
}
