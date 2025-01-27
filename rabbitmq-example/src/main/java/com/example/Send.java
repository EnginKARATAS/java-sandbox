package com.example;

import com.rabbitmq.client.*;

public class Send {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        // RabbitMQ bağlantısı oluşturuluyor
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");  // RabbitMQ server adresi (localhost varsayılan)
        try (Connection connection = factory.newConnection(); 
             Channel channel = connection.createChannel()) {

            // Kuyruğu oluşturuyoruz (eğer yoksa)
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            String message = "Hello World!";  // Gönderilecek mesaj

            // Mesajı kuyruğa gönderiyoruz
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
}
