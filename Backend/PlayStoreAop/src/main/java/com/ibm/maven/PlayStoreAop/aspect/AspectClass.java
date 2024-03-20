package com.ibm.maven.PlayStoreAop.aspect;
import java.util.Map;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.maven.PlayStoreAop.Service.App;

import org.aspectj.lang.annotation.Aspect;
@Component
@Aspect
	
public class AspectClass {
	@Autowired
	Map<Integer, App> map;

	@Pointcut("execution(* com.ibm.maven.PlayStoreAop.Service.AppOperation.list(..)) && args(appId)")
	void banAdvice(int appId) {};
	
	@Before("banAdvice(appId)")
	public void banApp(int appId) {
		map.get(appId).setVisible(false);
	}
	
//	@After("execution(* com.ibm.aop.service.PlayStoreOperations.list(..)) && args(appId)")
//	public void unBanApp(int appId) {
//		map.get(appId).setVisible(true);
//	}
	  
	
}
