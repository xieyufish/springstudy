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
		Person person = getBean("person5");
		System.out.println(person.getList());
		System.out.println(person.getMap());
		System.out.println(person.getProperties());
		System.out.println(person.getSet());
	}
	
	@Test
	public void test1() {
		MethodInjection methodInjection = getBean("mi");
		System.out.println(methodInjection.process("asdf"));
	}
	
	@Test
	public void test2() {
		MethodReplaced methodReplaced = getBean("mr");
		methodReplaced.replace();
	}
}
