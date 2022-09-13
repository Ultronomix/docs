package com.revature.util;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
	
	static {
		System.out.println("CustomBeanPostProcessor class loaded into memory");
	}
	
	{
		System.out.println("CustomBeanPostProcessor class instantiation started");
	}
	
	public CustomBeanPostProcessor() {
		System.out.println("CustomBeanPostProcessor - CustomBeanPostProcessor.new invoked");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("CustomBeanPostProcessor - BeanPostProcessor.postProcessBeforeInitialization invoked for bean with name: " + beanName);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("CustomBeanPostProcessor - BeanPostProcessor.postProcessAfterInitialization invoked for bean with name: " + beanName);
		return bean;
	}

}
