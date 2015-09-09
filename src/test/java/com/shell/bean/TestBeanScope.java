package com.shell.bean;

import org.junit.Test;

import com.shell.base.UnitTestBase;
import com.shell.ioc.BeanScope;

public class TestBeanScope extends UnitTestBase{
	public TestBeanScope() {
		super("classpath*:spring-beanscope.xml");
	}
	
	@Test
	public void testOut() {
		BeanScope beanScope = this.getBean("person");
		beanScope.out();
		
		BeanScope beanScope2 = this.getBean("person");
		beanScope2.out();
	}
}
