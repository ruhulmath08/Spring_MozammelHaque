package com.spring._automaticBeanDiscovery;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}

}
