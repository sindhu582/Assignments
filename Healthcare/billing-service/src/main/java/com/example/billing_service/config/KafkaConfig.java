package com.example.billing_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic appointmentConfirmedTopic() {
        // Match appointment-service topic
        return TopicBuilder.name("appointment-confirmed").build();
    }
}
