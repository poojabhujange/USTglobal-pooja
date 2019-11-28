package com.ustgobal.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcesserClass implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean before initialization:" +beanName);
		return bean;
		
		
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("bean After initialization:" +beanName);
		return bean;
		
		
			}
	
	
	
	
	
	
	
}
