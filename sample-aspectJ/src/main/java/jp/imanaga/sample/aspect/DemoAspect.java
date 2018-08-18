package jp.imanaga.sample.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class DemoAspect {

	@AfterReturning(pointcut = "call(* *.sayHello())")
	public void afterSayHello() {
		System.out.println("afterSayHello");
	}
}
