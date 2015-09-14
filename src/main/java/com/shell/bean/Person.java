/**
 * 
 */
package com.shell.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author xieyu
 * 
 */
public class Person {
	private String name;
	private Integer age;
	private Properties properties;
	private List<Object> list;
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	private Map<Object, Object> map;
	private Set<Object> set;

	public Person() {

	}

	public Person(String name) {
		System.out.println("invoke one arg's constructor method");
		this.name = name;
	}

	public Person(String name, Integer age) {
		System.out.println("invoke Person's constructor method");
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		System.out.println("invoke Person's setter method");
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		System.out.println("invoke Person's setter method");
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + "的年龄是:" + this.age;
	}

}
