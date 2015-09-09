package com.shell.resource;

import java.io.IOException;

import org.junit.Test;

import com.shell.base.UnitTestBase;

public class TestShellResource extends UnitTestBase{
	public TestShellResource() {
		super("classpath*:spring-resource.xml");
	}
	
	@Test
	public void test() throws IOException {
		ShellResource shellResource = super.getBean("shellResource");
		shellResource.resource();
	}
}
