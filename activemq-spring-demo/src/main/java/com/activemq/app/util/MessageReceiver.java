package com.activemq.app.util;

import javax.jms.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import com.activemq.app.model.Product;

@Component
public class MessageReceiver {

	@Autowired
	JmsTemplate jmsTemplate;
	@Autowired
	MessageConverter messageConverter;

	public Product receiveMessage() {
		try {
			Message message = jmsTemplate.receive();
//			String response = (String) messageConverter.fromMessage(message);
			Product response = (Product) messageConverter.fromMessage(message);
			return response;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
