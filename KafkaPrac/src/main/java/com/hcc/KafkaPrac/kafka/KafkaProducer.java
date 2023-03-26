package com.hcc.KafkaPrac.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	//Default provided logger to log the message
	private static final Logger lOGGER=LoggerFactory.getLogger(KafkaProducer.class);
	
	//We are using Kafka template to sent message to the topic
	private KafkaTemplate<String, String>kafkaTemplate;

	
	//constructor to inject that template
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message)
	{
		lOGGER.info(String.format("message sent %s", message));
		kafkaTemplate.send("Sunny", message);
	}
	

}
