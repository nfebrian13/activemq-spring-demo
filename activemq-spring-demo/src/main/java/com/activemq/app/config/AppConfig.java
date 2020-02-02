package com.activemq.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.activemq.app.configuration.MessagingConfiguration;

@Configuration
@ComponentScan(basePackages = "com.activemq.app")
@Import({ MessagingConfiguration.class })
public class AppConfig {

}
