package com.shell.lifecycle;

import org.junit.Test;

import com.shell.base.UnitTestBase;

public class TestBeanLifeCycle extends UnitTestBase{
	public TestBeanLifeCycle() {
		super("classpath*:spring-beanlifecycle.xml");
	}
	
	@Test
	public void test() {
		BeanLifeCycle beanLifeCycle = super.getBean("beanlifecycle");
	}
}
