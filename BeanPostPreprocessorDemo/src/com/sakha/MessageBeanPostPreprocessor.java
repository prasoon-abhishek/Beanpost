package com.sakha;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MessageBeanPostPreprocessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return bean;
		if(bean instanceof MessageBean){
			MessageBean messageBean="";
		}
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}

}
