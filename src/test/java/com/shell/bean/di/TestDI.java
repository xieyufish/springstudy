/**
 * 
 */
package com.shell.bean.di;

import org.junit.Test;

import com.shell.base.UnitTestBase;
import com.shell.bean.Person;

/**
 * @author xieyu
 *
 */
public class TestDI extends UnitTestBase{
	public TestDI(){
		super("classpath*:spring-di.xml");
	}
	
	@Test
	public void test() {
		Person person = getBean("person");
		System.out.println(person);
	}
}
