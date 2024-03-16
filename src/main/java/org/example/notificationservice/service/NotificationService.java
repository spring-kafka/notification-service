package org.example.notificationservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class NotificationService {
  Logger logger = Logger.getLogger(getClass().getName());

  @KafkaListener(topics = "notificationTopic", groupId = "notification-service-group")
  public void listen(String orderId) {
    logger.log(Level.INFO, "Order received with order id : {0}", orderId);
  }
}
