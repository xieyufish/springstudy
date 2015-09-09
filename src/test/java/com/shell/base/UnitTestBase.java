/**
 * 
 */
package com.shell.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author xieyu
 *
 */
public class UnitTestBase {
	private ClassPathXmlApplicationContext context;
	private String springXmlPath;
	
	public UnitTestBase(){
		
	}
	
	public UnitTestBase(String xmlPath) {
		this.springXmlPath = xmlPath;
	}
	
	@Before
	public void before() {
		if(StringUtils.isEmpty(this.springXmlPath)) {
			this.springXmlPath = "classpath*:spring-*.xml";
		}
		
		try {
			context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void after() {
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		try {
			return (T)context.getBean(beanId);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected <T extends Object> T getBean(Class<T> clazz) {
		try {
			return (T)context.getBean(clazz);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}
}
