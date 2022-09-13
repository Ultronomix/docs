package com.revature.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

public class OptionalDependency implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware,
		EmbeddedValueResolverAware, ResourceLoaderAware, ApplicationEventPublisherAware, MessageSourceAware,
		ApplicationContextAware, InitializingBean, DisposableBean {

	static {
		System.out.println("OptionalDependency class loaded into memory");
	}

	{
		System.out.println("OptionalDependency class instantiation started");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("OptionalDependency - BeanNameAware.setBeanName invoked");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("OptionalDependency - BeanClassLoaderAware.setBeanClassLoader invoked");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("OptionalDependency - BeanFactoryAware.setBeanFactory invoked");
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		System.out.println("OptionalDependency - EmbeddedValueResolverAware.setEmbeddedValueResolver invoked");
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("OptionalDependency - ResourceLoaderAware.setResourceLoader invoked");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("OptionalDependency - ApplicationEventPublisherAware.setApplicationEventPublisher invoked");
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("OptionalDependency - MessageSourceAware.setMessageSource invoked");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("OptionalDependency - ApplicationContextAware.setApplicationContext invoked");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("OptionalDependency - OptionalDependency.postConstruct invoked");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("OptionalDependency - InitializingBean.afterPropertiesSet invoked");
	}

	public void customInit() {
		System.out.println("OptionalDependency - OptionalDependency.customInit invoked");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("OptionalDependency - OptionalDependency.preDestroy invoked");
	}

	public void customDestroy() {
		System.out.println("OptionalDependency - OptionalDependency.customDestroy invoked");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("OptionalDependency - DisposableBean.destroy invoked");
	}
}

