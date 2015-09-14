/**
 * 
 */
package com.shell.bean.init;

import org.junit.Test;

import com.shell.base.UnitTestBase;
import com.shell.bean.Person;

/**
 * @author xieyu
 *
 */
public class TestInit extends UnitTestBase{
	public TestInit() {
		super("classpath*:spring-beaninit.xml");
	}
	
	@Test
	public void test() {
		Person person = getBean("person");
		System.out.println(person.getClass());
		
		Object sPerson = getBean("sperson");
		System.out.println(sPerson.getClass());
		
		Object iPerson = getBean("iperson");
		System.out.println(iPerson.getClass());
	}
}
