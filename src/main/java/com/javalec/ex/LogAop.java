package com.javalec.ex;

//proxy 설정 예제, AOP class
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

//	ProceedingJoinPoint 여러 기능을 joinpoint로 선언
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
//		어떤 메소드인지 이름 얻기
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr+" is start");
		long st = System.currentTimeMillis();
		
		try {
//			핵심 기능 실행
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr+" is finished");
			System.out.println(signatureStr+" 경과 시간 : "+(et-st));
		}
	}
}
