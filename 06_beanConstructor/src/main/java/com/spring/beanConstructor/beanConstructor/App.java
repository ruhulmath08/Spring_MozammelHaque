package com.spring.beanConstructor.beanConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/beanConstructor/beanConstructor/beans/beans.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		((ClassPathXmlApplicationContext) context).close();
	}
}
