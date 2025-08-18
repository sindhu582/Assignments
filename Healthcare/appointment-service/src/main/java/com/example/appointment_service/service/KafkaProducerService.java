package com.example.appointment_service.service;



import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendAppointmentConfirmedMessage(String message) {
        kafkaTemplate.send("appointment-confirmed", message);
        System.out.println("📩 Sent Kafka message: " + message);
    }
}
