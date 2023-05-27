package org.odyildiz;

import org.odyildiz.common.DomainComponent;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@EnableRabbit
@ComponentScan(includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {DomainComponent.class})})
public class PaymentInfraApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentInfraApplication.class, args);
	}

}
