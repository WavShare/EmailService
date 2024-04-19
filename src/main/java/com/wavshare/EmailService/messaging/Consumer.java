package com.wavshare.EmailService.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Consumer {
    @RabbitListener(queues = "ownership_email")
    public void listen(String message) {
        System.out.println("Message read from ownership_email : " + message);
    }
}
