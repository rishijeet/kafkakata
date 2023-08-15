package com.example.kafkaconnector.controller;

import com.example.kafkaconnector.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class KafkaController {
    @Autowired
    Producer producer;

    @PostMapping(value = "/queue")
    public void sendMessage(@RequestParam("msg") String msg) {
        producer.publishToTopic(msg);

    }
}
