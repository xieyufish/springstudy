package com.shell.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle /*implements InitializingBean, DisposableBean*/{
	private String name;
	
	public void setName(String name) {
		System.out.println("set method");
		this.name = name;
	}

//	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("BeanLifeCycle afterPropertiesSet");
	}

//	@Override
	public void destroy() throws Exception {
		System.out.println("Bean LifeCycle destroy");
	}
	
//	public void defaultInit() {
//		System.out.println("BeanLiftCycle defaultInit");
//	}
//	
//	public void defaultDestroy() {
//		System.out.println("BeanLiftCycle defaultDestroy");
//	}
//	
//	public void start() {
//		System.out.println("BeanLiftCycle start");
//	}
//	
//	public void stop() {
//		System.out.println("BeanLiftCycle stop");
//	}

}
