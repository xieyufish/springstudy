/**
 * 
 */
package com.shell.bean;

/**
 * @author xieyu
 * 
 */
public class Person {
	private String name;
	private Integer age;
	
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
