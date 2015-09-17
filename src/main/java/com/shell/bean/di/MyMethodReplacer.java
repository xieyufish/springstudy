/**
 * 
 */
package com.shell.bean.di;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @author xieyu
 *
 */
public class MyMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println(obj);
		System.out.println(method);
		System.err.println(args);
		MethodReplaced methodReplaced = (MethodReplaced) obj;
		method.invoke(methodReplaced);
		return null;
	}

}
