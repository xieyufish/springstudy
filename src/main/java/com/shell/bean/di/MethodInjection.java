/**
 * 
 */
package com.shell.bean.di;

/**
 * @author xieyu
 *
 */
public abstract class MethodInjection {
	
	public String process(String string) {
		return createString(string);
	}
	
	public abstract String createString(String string);
	
	public abstract String create(String string, Integer integer);
}
