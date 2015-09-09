/**
 * 
 */
package com.shell.bean;

import org.junit.Test;

import com.shell.base.UnitTestBase;

/**
 * @author xieyu
 *
 */
public class TestPerson extends UnitTestBase{
	
	public TestPerson() {
		super("classpath*:spring-valueset.xml");
	}
	
	@Test
	public void test() {
		Person person = super.getBean("person");
		Person person1 = super.getBean("person1");
		System.out.println(person.getName() + person.getAge());
		System.out.println(person1.getName());		
		System.out.println(person.hashCode() + "\n" + person1.hashCode());
	}
}
