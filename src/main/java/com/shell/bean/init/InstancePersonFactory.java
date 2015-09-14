/**
 * 
 */
package com.shell.bean.init;

import com.shell.bean.Person;

/**
 * @author xieyu
 *
 */
public class InstancePersonFactory {
	public Person person = new Person();
	
	private InstancePersonFactory(){}
	
	public Person createInstance() {
		return person;
	}
}
