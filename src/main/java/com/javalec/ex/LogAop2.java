package com.javalec.ex;

//proxy 어노테이션 설정 예제, AOP class
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop2 {

	@Pointcut("within(com.javalec.ex.*)") 
	private void pointcutMethod() {
		
	}

	
	@Around("pointcutMethod()")
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
