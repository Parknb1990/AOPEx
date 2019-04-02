package com.javalec.ex;

//proxy 어노테이션 설정 예제, AOP class
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//Aspect 역할을 할 클래스라고 명시
@Aspect
public class LogAop4 {
	
//	Pointcut이라고 명시된 메소드가 필요
//	@Pointcut의 속성에 핵심코드의 어느 부분까지 공통기능으로 사용하겠다고 명시
	@Pointcut("within(com.javalec.ex.*)")
	private void pointcutMethod() {
		
	}

	
	@Around("pointcutMethod()")	//around가 적용될 pointcut을 명시
	public Object loggerAop4(ProceedingJoinPoint joinpoint) throws Throwable {
		

		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr+" 시작"); // 메소드 실행
		
		System.out.println("핵심 기능 전에 실행 할 공통 기능입니다. "+System.currentTimeMillis());
		
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
