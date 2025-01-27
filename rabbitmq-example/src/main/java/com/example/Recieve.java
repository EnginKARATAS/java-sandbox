package com.example;

import com.rabbitmq.client.*;

public class Recieve {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        // RabbitMQ bağlantısı oluşturuluyor
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");  // RabbitMQ server adresi (localhost varsayılan)
        try (Connection connection = factory.newConnection(); 
             Channel channel = connection.createChannel()) {

            // Kuyruğu oluşturuyoruz (eğer yoksa)
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

            // Mesajları alıyoruz ve işliyoruz
            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                String message = new String(delivery.getBody(), "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            };
            
            // Kuyruktan mesaj almak için dinleyici başlatıyoruz
            channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
        }
    }
}
