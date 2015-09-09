package com.shell.aware;

import org.junit.Test;

import com.shell.base.UnitTestBase;

public class TestShellApplicationContext extends UnitTestBase {
	public TestShellApplicationContext() {
		super("classpath*:spring-aware.xml");
	}
	
	@Test
	public void test() {
		ShellApplicationContext shellApplicationContext = super.getBean("shellApplicationContext");
		System.out.println("test shellApplicationContext:" + shellApplicationContext.hashCode());
	}
}
