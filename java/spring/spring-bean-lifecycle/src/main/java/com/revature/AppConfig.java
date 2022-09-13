package com.revature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.beans.MandatoryDependency;
import com.revature.beans.OptionalDependency;
import com.revature.beans.SpringBean;
import com.revature.util.CustomBeanPostProcessor;

@Configuration
public class AppConfig {
	
	static {
		System.out.println("AppConfig class loaded into memory");
	}

	{
		System.out.println("AppConfig class instantiation started");
	}
	
	public AppConfig() {
		System.out.println("AppConfig - AppConfig.new invoked");
	}

	@Bean(initMethod="customInit", destroyMethod="customDestroy")
	public SpringBean springBean() {
		SpringBean springBean = new SpringBean(mandatoryDependency());
		springBean.setOptionalDependency(optionalDependency());
		return springBean;
	}
	
	@Bean(initMethod="customInit", destroyMethod="customDestroy")
	public MandatoryDependency mandatoryDependency() {
		return new MandatoryDependency();
	}
	
	@Bean(initMethod="customInit", destroyMethod="customDestroy")
	public OptionalDependency optionalDependency() {
		return new OptionalDependency();
	}
	
	@Bean
	public CustomBeanPostProcessor customBeanPostProcessor() {
		return new CustomBeanPostProcessor();
	}
	
}
