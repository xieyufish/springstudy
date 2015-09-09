package com.shell.autowiring;

import org.junit.Test;

import com.shell.base.UnitTestBase;

public class TestAutoWiringService extends UnitTestBase{
	public TestAutoWiringService() {
		super("classpath*:spring-autowiring.xml");
	}
	
	@Test
	public void dao() {
		AutoWiringService autoWiringService = super.getBean("autoWiringService");
		autoWiringService.dao("hello");
	}
}
