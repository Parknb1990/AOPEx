package com.javalec.ex;

//proxy 어노테이션 설정 예제, AOP class
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class LogAop3 {

	public Object loggerAop3(ProceedingJoinPoint joinpoint) throws Throwable {

//		공통 기능이 적용되는 메소드가 어떤 메소드인지 출력하기 위해 메소드명을 얻어옴.
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr+" 시작"); // 메소드 실행
		
		System.out.println("핵심 기능 전에 실행 할 공통 기능입니다. "+System.currentTimeMillis());
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();	// 핵심 기능 실행
			return obj;
		} finally {
//			공통 기능
			System.out.println("핵심 기능 후에 실행 할 공통 기능입니다. "+System.currentTimeMillis());
			System.out.println(signatureStr+" 끝.");
		}
	}
	
}
