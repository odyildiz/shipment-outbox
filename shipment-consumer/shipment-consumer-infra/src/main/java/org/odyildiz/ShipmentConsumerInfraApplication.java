package org.odyildiz;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class ShipmentConsumerInfraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShipmentConsumerInfraApplication.class, args);
    }

}
