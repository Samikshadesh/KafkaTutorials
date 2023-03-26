package com.hcc.KafkaPrac.kafka;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.hcc.KafkaPrac.entity.Users;

@Service
public class JsonKafkaProducer 
{
	private static final Logger LOGGER=LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	private KafkaTemplate<String, Users>kafkaTemplate;
	
	
	public void sendMessage(Users users) {
		
		LOGGER.info(String.format("Message sent ->%s", users.toString()));
		
		Message<Users>message =MessageBuilder
				.withPayload(users)
				.setHeader(KafkaHeaders.TOPIC, "Sunny_json")
				.build();
		kafkaTemplate.send(message);
	}

}
