package com.hcc.KafkaPrac.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.hcc.KafkaPrac.entity.Users;

@Service
public class JsonKafakaConsumer {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafakaConsumer.class);
	
	//JSON JsonDeserializer
	@KafkaListener(topics = "Sunny_Json",groupId="myGroup")
	public void consumer(Users users)
	{
		LOGGER.info(String.format("Json message received ->%s", users.toString()));
	}

}
