package com.shell.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ShellApplicationContext implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ShellApplicationContext:" + applicationContext.getBean("shellApplicationContext").hashCode());
	}
	
}
