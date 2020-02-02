package com.activemq.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.activemq.app.config.AppConfig;

public class MessageConcumerApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		try {
			Thread.sleep(6000000);

		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		((AbstractApplicationContext) context).close();

	}
}
