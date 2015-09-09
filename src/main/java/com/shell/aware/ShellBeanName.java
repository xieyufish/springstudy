package com.shell.aware;

import org.springframework.beans.factory.BeanNameAware;

public class ShellBeanName implements BeanNameAware {
	private String beanName;
	
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println("beanName:" + beanName);
	}
}
