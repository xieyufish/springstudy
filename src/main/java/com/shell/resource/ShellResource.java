package com.shell.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class ShellResource implements ApplicationContextAware{
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException {
		Resource resource = applicationContext.getResource("file:///D:\\workspace\\springdemo\\src\\main\\resources\\spring-aware.xml");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
