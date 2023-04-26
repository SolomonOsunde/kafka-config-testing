package com.kafkasample;


import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkasample",groupId = "groupId")
    void listener(String data){
        System.out.println("Received data : " + data + " 🍾");
    }
}
