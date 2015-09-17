/**
 * 
 */
package com.shell.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author xieyu
 * 
 */
public class Person implements BeanNameAware{
	private Integer age;
	private List<Object> list;
	private Map<Object, Object> map;
	private String name;
	
	private Properties properties;

	private Set<Object> set;
	private String beanName;

	public Person() {
		System.out.println("invoke empty constructor method:" + beanName);
	}

	public Person(String name) {
		System.out.println("invoke one arg's constructor method:" + beanName);
		this.name = name;
	}

	public Person(String name, Integer age) {
		System.out.println("invoke Person's constructor method:" + beanName);
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	public List<Object> getList() {
		return list;
	}

	public Map<Object, Object> getMap() {
		return map;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public Properties getProperties() {
		return properties;
	}

	public Set<Object> getSet() {
		return set;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		System.out.println("invoke Person's setter method:" + beanName);
		this.age = age;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		System.out.println("invoke Person's setter method:" + beanName);
		this.name = name;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return this.name + "的年龄是:" + this.age;
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		this.beanName = name;
	}

}
