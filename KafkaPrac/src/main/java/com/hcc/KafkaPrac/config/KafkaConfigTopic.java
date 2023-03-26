package com.hcc.KafkaPrac.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigTopic 
{
	@Bean
	//kafka Topic
	public NewTopic javaGuidesTopic()
	{
		return TopicBuilder.name("Sunny").build();//.partitions(10)
	}
	
	@Bean
	public NewTopic javaguidesJsonTopic()
	{
		return TopicBuilder.name("Sunny_Json").build();
	}

}
