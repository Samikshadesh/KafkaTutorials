package com.hcc.KafkaPrac.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcc.KafkaPrac.entity.Users;
import com.hcc.KafkaPrac.kafka.JsonKafkaProducer;

@RestController
@RequestMapping("/json")
public class JsonMessageController {
	
	public JsonKafkaProducer jsonKafkaProducer;

	public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
		super();
		this.jsonKafkaProducer = jsonKafkaProducer;
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String>publish(@RequestBody Users users){
		jsonKafkaProducer.sendMessage(users);
		return ResponseEntity.ok("JSON Message sent!...");
	}

}
