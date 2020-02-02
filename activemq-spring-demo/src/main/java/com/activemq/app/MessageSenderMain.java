package com.activemq.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.activemq.app.config.AppConfig;
import com.activemq.app.model.Product;
import com.activemq.app.util.MessageSender;

public class MessageSenderMain {

	public static void main(String[] args) {
		try {

			AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			MessageSender messageSender = context.getBean(MessageSender.class);
			
			Product product = new Product();
			product.setProductId(200);
			product.setProductName("Book");
			product.setQuantity(10);
			messageSender.sendMessage(product);
			System.out.println("Message Has Been sent succesfully");
			((AbstractApplicationContext) context).close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
