/**
 * 
 */
package com.shell.bean.init;

import com.shell.bean.Person;

/**
 * @author xieyu
 *
 */
public class StaticPersonFactory {
	private static Person person = new Person();
	
	private StaticPersonFactory(){}
	
	public static Person createInstance() {
		return person;
	}
}
