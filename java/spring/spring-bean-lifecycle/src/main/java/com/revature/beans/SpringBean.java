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
import org.springframework.beans.factory.config.BeanPostProcessor;
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

public class SpringBean implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, EmbeddedValueResolverAware,
		ResourceLoaderAware, ApplicationEventPublisherAware, MessageSourceAware, ApplicationContextAware, InitializingBean, 
		DisposableBean {
	
	private MandatoryDependency mandatoryDep;
	private OptionalDependency optionalDep;

	static {
		System.out.println("SpringBean class loaded into memory");
	}

	{
		System.out.println("SpringBean class instantiation started");
	}
	
	public SpringBean(MandatoryDependency mdep) {
		this.mandatoryDep = mdep;
		System.out.println("SpringBean - SpringBean.new invoked - injecting: " + mandatoryDep.getClass().toString());
	}
	
	public void setOptionalDependency(OptionalDependency odep) {
		this.optionalDep = odep;
		System.out.println("SpringBean - SpringBean.setOptionalDependency invoked - injecting: " + optionalDep.getClass().toString());
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("SpringBean - BeanNameAware.setBeanName invoked");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("SpringBean - BeanClassLoaderAware.setBeanClassLoader invoked");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("SpringBean - BeanFactoryAware.setBeanFactory invoked");
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		System.out.println("SpringBean - EmbeddedValueResolverAware.setEmbeddedValueResolver invoked");
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("SpringBean - ResourceLoaderAware.setResourceLoader invoked");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("SpringBean - ApplicationEventPublisherAware.setApplicationEventPublisher invoked");
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("SpringBean - MessageSourceAware.setMessageSource invoked");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("SpringBean - ApplicationContextAware.setApplicationContext invoked");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("SpringBean - SpringBean.postConstruct invoked");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("SpringBean - InitializingBean.afterPropertiesSet invoked");
	}

	public void customInit() {
		System.out.println("SpringBean - SpringBean.customInit invoked");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("SpringBean - SpringBean.preDestroy invoked");
	}

	public void customDestroy() {
		System.out.println("SpringBean - SpringBean.customDestroy invoked");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("SpringBean - DisposableBean.destroy invoked");
	}

}
