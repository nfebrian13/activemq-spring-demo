package com.activemq.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.activemq.app.config.AppConfig;
import com.activemq.app.util.MessageReceiver;

public class MessageReceiverMain {

	public static void main(String[] args) {
		try {
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
			String response = messageReceiver.receiveMessage();
			
			System.out.println("response is " + response);
			((AbstractApplicationContext) context).close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
