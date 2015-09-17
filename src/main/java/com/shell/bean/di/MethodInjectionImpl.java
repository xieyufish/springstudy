/**
 * 
 */
package com.shell.bean.di;

/**
 * @author xieyu
 *
 */
public class MethodInjectionImpl extends MethodInjection {

	@Override
	public String createString(String string) {
		System.out.println("MethodInjectionImpl");
		return string;
	}

	@Override
	public String create(String string, Integer integer) {
		System.out.println("MethodInjectionImplll");
		return string + integer;
	}

}
