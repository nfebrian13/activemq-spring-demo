package com.activemq.app.configuration;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.activemq.app.model.Product;

import org.springframework.jms.support.converter.MessageConverter;

@Component
public class MessageReceiverConf implements MessageListener {

	@Autowired
	JmsTemplate jmsTemplate;

	@Autowired
	MessageConverter messageConverter;

	public void onMessage(Message message) {
		try {
			Product product = (Product) messageConverter.fromMessage(message);
			
			System.out.println("----inside---");
			System.out.println(product);
			System.out.println("----inside---");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
