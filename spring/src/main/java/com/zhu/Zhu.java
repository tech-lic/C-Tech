package com.zhu;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


//把这个类声明为一个切面：先把该类 放入到IOC容器中，然后再声明为一个切面
@Aspect
@Component



public class Zhu {
//前置通知，目标方法执行前执行
@Before("execution(*com.dao.*.*(int,int)")
public void beforeMethod(JoinPoint joinPoint){
	String methodName=joinPoint.getSignature().getName();
	List<Object> args=Arrays.asList(joinPoint.getArgs());
	System.out.println("methodName"+methodName+"begin with"+args);
}
	
	
	
}
